package bd.ac.seu.cheesemvc.models;

/**
 * Created by R@kib Hasan Sabbir
 */
public class Cheese {
    public String name;
    public String ID;
    public String Email;
    public int cheeseID;
    public static int nextID = 1;

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
}


