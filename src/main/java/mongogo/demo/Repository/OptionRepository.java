package mongogo.demo.Repository;

import mongogo.demo.Classes.Option;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends MongoRepository<Option,Integer> {

    List<Option> findAll();
    Option findByOptionId(Integer id);
    void deleteByOptionId(Integer id);
}
