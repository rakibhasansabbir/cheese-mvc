package bd.ac.seu.cheesemvc.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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

    @ManyToOne
    private Category category;

    @ManyToMany(mappedBy = "cheeses")
    private List<Menu> menus;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}


