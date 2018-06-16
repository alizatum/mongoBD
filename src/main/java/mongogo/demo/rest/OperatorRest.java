package mongogo.demo.rest;


import mongogo.demo.Classes.Operator;
import mongogo.demo.Repository.OperatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/operators")
@RestController()
public class OperatorRest {

    @Autowired
    OperatorRepository repo;

    @GetMapping("/findAll")
    List<Operator> getAll(){
        return repo.findAll();
    }

    @GetMapping("/findById/{id}")
    Operator findById(@PathVariable Integer id){
        return repo.findByOperatorId(id);
    }

    @GetMapping("/add/{id}/{name}")
    Operator save(@PathVariable Integer id,@PathVariable String name){
        return repo.save(new Operator(id, name));
    }

    @GetMapping("/deleteById/{id}")
    void delete(@PathVariable Integer id){
        repo.deleteByOperatorId(id);
    }

}
