package mongogo.demo.rest;


import mongogo.demo.Classes.Option;
import mongogo.demo.Repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/options")
@RestController()
public class OptionRest {

    @Autowired
    OptionRepository repo;

    @GetMapping("/findAll")
    List<Option> getAll(){
        return repo.findAll();
    }

    @GetMapping("/findById/{id}")
    Option findById(@PathVariable Integer id){
        return repo.findByOptionId(id);
    }

    @GetMapping("/add/{id}/{name}/{price}")
    Option save(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer price){
        return repo.save(new Option(id, name,price));
    }

    @GetMapping("/deleteById/{id}")
    void delete(@PathVariable Integer id) {
        repo.deleteByOptionId(id);
    }
}
