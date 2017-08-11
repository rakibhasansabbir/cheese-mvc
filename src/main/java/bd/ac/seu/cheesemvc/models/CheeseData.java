package bd.ac.seu.cheesemvc.models;

import java.util.ArrayList;

/**
 * Created by R@kib Hasan Sabbir
 */
public class CheeseData {
    static ArrayList<Cheese> AList1 = new ArrayList<>();

    //getAll
    public static ArrayList<Cheese> getAll(){
        return AList1;
    }

    //add
    public static void add(Cheese newCheese){
        AList1.add(newCheese);
    }

    //remove
    public static void remove(int id){
        Cheese cheeseToRemove = getById(id);
        AList1.remove(cheeseToRemove);
    }

    //getById
    public static Cheese getById(int id){
        Cheese theCheese = null;
        for (Cheese candidateCheese : AList1){
            if (candidateCheese.getCheeseID() == id){
                theCheese = candidateCheese;
            }
        }
        return theCheese;
    }
}
