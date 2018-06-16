package mongogo.demo.Classes;


import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "options")
public class Option {

    @Id
    @Indexed(unique = true)
    private Integer optionId;
//    @Indexed(unique = true)
    private String name;
    private Integer price;

    public Option(Integer optionId, String name, Integer price) {
        this.optionId = optionId;
        this.name = name;
        this.price=price;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
