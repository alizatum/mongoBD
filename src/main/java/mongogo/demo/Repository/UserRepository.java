package mongogo.demo.Repository;

import mongogo.demo.Classes.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Integer> {

    List<User> findAll();
    User findByUserId(Integer id);
    void deleteByUserId(Integer id);
}
