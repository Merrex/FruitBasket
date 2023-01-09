package Objects;

import java.util.ArrayList;
import java.util.TooManyListenersException;

public class ShelfBowl {

    public ArrayList<Fruit> ShelfFruitList;

    public int ShelfNumber;
    public String sortBy;//color, type, size
    public String color;

    //public static int ShelfSize;
    public static ArrayList<ShelfBowl> SHELFLIST= new ArrayList<ShelfBowl>();


    public ShelfBowl(){
        System.out.println("ShelfBowl constructor");
        updateShelfList(this);

    }
    public void updateShelfList(ShelfBowl shelf){
        SHELFLIST.add(shelf);
    }

    public static void displayShelfList(){
        System.out.println("Shelf Lists \n");
        SHELFLIST.stream().forEach(shelf -> System.out.println("Shelf Number: "+shelf.ShelfNumber+"\n"
                +"Sort By: "+shelf.sortBy+"\n"
                +"Shelf Color: "+shelf.color+"\n"
                +"Total Fruits: "+shelf.ShelfFruitList));
        System.out.println();
    }
}

