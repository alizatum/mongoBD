package mongogo.demo.Classes;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "tariffs")
public class Tariff {

    @Id
    @Indexed(unique = true)
    private Integer tariffId;
//    @Indexed(unique = true)
    private String name;
    private Integer numberOfGB;
    private Integer numberOfMin;
    private Integer numberOfSMS;
    private Integer price;

    public Tariff(Integer tariffId, String name, Integer numberOfGB,Integer numberOfMin,Integer numberOfSMS,Integer price) {
        this.tariffId = tariffId;
        this.name = name;
        this.numberOfGB=numberOfGB;
        this.numberOfMin=numberOfMin;
        this.numberOfSMS=numberOfSMS;
        this.price=price;
    }

    public Integer getTariffId() {
        return tariffId;
    }

    public void setTariffId(Integer tariffId) {
        this.tariffId = tariffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfGB() {
        return numberOfGB;
    }

    public void setNumberOfGB(Integer numberOfGB) {
        this.numberOfGB = numberOfGB;
    }

    public Integer getNumberOfMin() {
        return numberOfMin;
    }

    public void setNumberOfMin(Integer numberOfMin) {
        this.numberOfMin = numberOfMin;
    }

    public Integer getNumberOfSMS() {
        return numberOfSMS;
    }

    public void setNumberOfSMS(Integer numberOfSMS) {
        this.numberOfSMS = numberOfSMS;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }



}
