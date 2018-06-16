package mongogo.demo.Classes;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "users")
public class User {

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getPassport() {
        return passport;
    }

    public void setPassport(Integer passport) {
        this.passport = passport;
    }

    @Id
    @Indexed(unique = true)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String middleName;
    @Indexed(unique = true)
    private Integer passport;

    public User(Integer userId, String firstName,String lastName,String middleName,Integer passport) {
        this.userId = userId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.passport = passport;
    }


}
