package mongogo.demo.Repository;

import com.mongodb.WriteResult;
import mongogo.demo.Classes.City;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CityRepository extends MongoRepository<City,Integer> {



    List<City> findAll();
    City findByCityId(Integer id);
    void deleteByCityId(Integer id);

//    @Query("{'cityId' : ?0},{$set{'name': ?1}}")
//    void updateName( Integer id,  String name);
//    WriteResult wr = mongoTemplate.updateMulti(
//            new Query(where("empAge").is(24)),new Update().inc("salary", 50.00),Employee.class);
}