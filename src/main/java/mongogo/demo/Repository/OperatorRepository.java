package mongogo.demo.Repository;

import mongogo.demo.Classes.Operator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperatorRepository extends MongoRepository<Operator,Integer> {

    List<Operator> findAll();
    Operator findByOperatorId(Integer id);
    void deleteByOperatorId(Integer id);
}
