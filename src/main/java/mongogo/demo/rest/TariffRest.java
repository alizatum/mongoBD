package mongogo.demo.rest;


import mongogo.demo.Classes.Tariff;
import mongogo.demo.Repository.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/tariffs")
@RestController()
public class TariffRest {

    @Autowired
    TariffRepository repo;

    @GetMapping("/findAll")
    List<Tariff> getAll(){
        return repo.findAll();
    }

    @GetMapping("/findById/{id}")
    Tariff findById(@PathVariable Integer id){
        return repo.findByTariffId(id);
    }

    @GetMapping("/add/{id}/{name}/{numberOfGB}/{numberOfMin}/{numberOfSMS}/{price}")
    Tariff save(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer numberOfGB,@PathVariable Integer numberOfMin,@PathVariable Integer numberOfSMS,@PathVariable Integer price){
        return repo.save(new Tariff(id, name,numberOfGB,numberOfMin,numberOfSMS,price));
    }

    @GetMapping("/deleteById/{id}")
    void delete(@PathVariable Integer id) {
        repo.deleteByTariffId(id);
    }
}
