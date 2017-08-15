package bd.ac.seu.cheesemvc.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by R@kib Hasan Sabbir
 */
@Entity
public class Cheese {

    @Id
    @GeneratedValue
    private int ids;

    @NotNull
    @Size(min = 3,max = 25)
    private String name;


    @NotNull
    @Size(min = 1,message = "ID must not be empty")
    private String ID;


    @NotNull
    @Size(min = 1,message = "Email must not be empty")
    private String Email;

    private CheeseType type;

    public Cheese(String name, String ID, String email) {
        this.name = name;
        this.ID = ID;
        Email = email;
    }

    public Cheese() { }

    public int getIds() {
        return ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}


