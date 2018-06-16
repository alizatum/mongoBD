package mongogo.demo.Classes;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "operators")
public class Operator {

        @Id
        @Indexed(unique = true)
        private Integer operatorId;
//        @Indexed(unique = true)
        private String name;

        public Operator(Integer operatorId, String name) {
            this.operatorId = operatorId;
            this.name = name;
        }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
