package mongogo.demo.Repository;

import mongogo.demo.Classes.Tariff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TariffRepository extends MongoRepository<Tariff,Integer> {

    List<Tariff> findAll();
    Tariff findByTariffId(Integer id);
    void deleteByTariffId(Integer id);
}
