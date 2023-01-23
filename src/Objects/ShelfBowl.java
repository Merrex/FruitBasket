package Objects;

import java.util.ArrayList;

public class ShelfBowl {

    private ArrayList<Fruit> ShelfFruitList;

    private int ShelfNumber;

    private String color;
    private String size;
    private static ArrayList<ShelfBowl> shelfBowlList = new ArrayList<ShelfBowl>();


    public ShelfBowl() {
    }

    public ShelfBowl(int a) {
        System.out.println("ShelfBowl constructor");
        updateShelfList(this);

    }
    public void updateShelfList(ShelfBowl shelf) {
        getShelfBowlList().add(shelf);
    }

    public static void displayShelfList() {
        System.out.println("Shelf Lists \n");
        getShelfBowlList().stream().forEach(shelf -> System.out.println("Shelf Number: " + shelf.getShelfNumber() + "\n"
                + "Shelf Color: " + shelf.getColor() + "\n"
                + "Total Fruits: " + shelf.getShelfFruitList()));
        System.out.println();
    }

    public static ArrayList<ShelfBowl> getShelfBowlList() {
        return shelfBowlList;
    }

    public ArrayList<Fruit> getShelfFruitList() {
        return ShelfFruitList;
    }

    public void setShelfFruitList(ArrayList<Fruit> shelfFruitList) {
        ShelfFruitList = shelfFruitList;
    }

    public int getShelfNumber() {
        return ShelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        ShelfNumber = shelfNumber;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


//Not needed
//    public static void setShelfBowlList(ArrayList<ShelfBowl> shelfBowlList) {
//        ShelfBowl.shelfBowlList = shelfBowlList;
//    }


}

