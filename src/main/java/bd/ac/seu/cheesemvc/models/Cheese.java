package bd.ac.seu.cheesemvc.models;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by R@kib Hasan Sabbir
 */
public class Cheese {

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

    private int cheeseID;
    private static int nextID = 1;

    public Cheese(String name, String ID, String email) {
        this();
        this.name = name;
        this.ID = ID;
        Email = email;
    }

    public Cheese() {
        cheeseID = nextID;
        nextID++;
    }

    public int getCheeseID() {
        return cheeseID;
    }

    public void setCheeseID(int cheeseID) {
        this.cheeseID = cheeseID;
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


