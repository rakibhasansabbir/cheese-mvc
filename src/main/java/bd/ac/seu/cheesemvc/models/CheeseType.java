package bd.ac.seu.cheesemvc.models;

/**
 * Created by R@kib Hasan Sabbir
 */
public enum CheeseType {

    MALE("male"),
    FEMALE("female"),
    OTHERS("others");

    private final String name;

    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
