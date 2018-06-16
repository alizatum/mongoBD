package mongogo.demo.rest;

import mongogo.demo.Classes.City;
import mongogo.demo.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.ScriptOperations;
import org.springframework.data.mongodb.core.script.ExecutableMongoScript;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/cities")
@RestController()
public class CityRest {

    @Autowired
    CityRepository repo;

    @Autowired
    MongoOperations mongoOperations;

    @GetMapping("/findAll")
    List<City> getAll(){
        return repo.findAll();
    }

    @GetMapping("/findById/{id}")
    City findById(@PathVariable Integer id){
        return repo.findByCityId(id);
    }

    @GetMapping("/add/{id}/{name}")
    City save(@PathVariable Integer id,@PathVariable String name){
        return repo.save(new City(id, name));
    }

    @GetMapping("/deleteById/{id}")
    void delete(@PathVariable Integer id){
        repo.deleteByCityId(id);
    }

//    @GetMapping("/f1")
//    Double f1(){
//       return Double.valueOf(mongoOperations.scriptOps().call("F1",3,4).toString());
//    }
    @GetMapping("/f2/{id}/{name}")
    void f2(@PathVariable Integer id,@PathVariable String name){
        mongoOperations.scriptOps().call("F3",id,name);
    }

//    @GetMapping("/updateName/{id}/{name}")
//    void updateName(@PathVariable Integer id, @PathVariable String name){
//        repo.updateName(id,name);

    }

