package mongogo.demo.rest;


import mongogo.demo.Classes.User;
import mongogo.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController()
public class UserRest {

    @Autowired
    UserRepository repo;

    @GetMapping("/findAll")
    List<User> getAll(){
        return repo.findAll();
    }

    @GetMapping("/findById/{id}")
    User findById(@PathVariable Integer id){
        return repo.findByUserId(id);
    }

    @GetMapping("/add/{id}/{firstName}/{lastName}/{middleName}/{passport}")
    User save(@PathVariable Integer id,@PathVariable String firstName,@PathVariable String lastName,@PathVariable String middleName,@PathVariable Integer passport){
        return repo.save(new User(id, firstName,lastName,middleName,passport));
    }

    @GetMapping("/deleteById/{id}")
    void delete(@PathVariable Integer id) {
        repo.deleteByUserId(id);
    }
}
