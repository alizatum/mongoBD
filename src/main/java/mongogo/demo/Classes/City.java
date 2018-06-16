package mongogo.demo.Classes;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "cities")
    public class City {


        @Id
        @Indexed(unique = true)
        private Integer cityId;

//        @Indexed(unique = true)
        private String name;

        public City(Integer cityId, String name) {
            this.cityId = cityId;
            this.name = name;
        }

        public Integer getCityId() {
            return cityId;
        }

        public void setCityId(Integer cityId) {
            this.cityId = cityId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
