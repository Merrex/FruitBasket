package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BasketStand extends ShelfBowl implements Bowl {

    private ShelfBowl[] shelves;
    private int TotalShelf;
    private String sortBy;//color, type, size
    private List<String> BasketColorList;
    private List<String> BasketSizeList;
    private static ArrayList<Fruit> BasketFruitList;


    public BasketStand(String sortBy) {
        setSortBy(sortBy);
        //ShelfSize=shelfSize;//ShelfBowl Class
        if (sortBy.equalsIgnoreCase("color")) {
            //(FruitBowl.getHashColor().size()>10)?
            setTotalShelf(FruitBowl.getHashColor().size());
        } else if (sortBy.equalsIgnoreCase(("size"))) {
            setTotalShelf(FruitBowl.getHashSize().size());
        }
        setShelves(new ShelfBowl[getTotalShelf()]);
        setBasketFruitList(new ArrayList<>());
        assignShelfProperties(sortBy);


    }

    public void assignShelfProperties(String sortBy) {

        if (sortBy.equalsIgnoreCase("color")) {
            getColorList();
            for (int i = 0; i < getTotalShelf(); i++) {
                getShelves()[i] = new ShelfBowl(1);
                getShelves()[i].setShelfFruitList(new ArrayList<>());
                getBasketFruitList().addAll(getShelves()[i].getShelfFruitList());
                getShelves()[i].setShelfNumber(i + 1);
                getShelves()[i].setColor(getBasketColorList().get(i));
                getShelves()[i].setSize("0");

            }
        } else if (sortBy.equalsIgnoreCase(("size"))) {

            getSizeList();
            for (int i = 0; i < getTotalShelf(); i++) {
                getShelves()[i] = new ShelfBowl(1);
                getShelves()[i].setShelfFruitList(new ArrayList<>());
                getBasketFruitList().addAll(getShelves()[i].getShelfFruitList());
                getShelves()[i].setShelfNumber(i + 1);
                getShelves()[i].setColor("NA");
                getShelves()[i].setSize(getBasketSizeList().get(i));
            }
        }
        //System.out.println(getShelves().length);
    }

    public int getTotalShelf() {
        return TotalShelf;
    }

    public void setTotalShelf(int totalShelf) {
        TotalShelf = totalShelf;
    }

    public void showBasketStandContent() {
        System.out.println("Basket Stand Content \n");
        getBasketFruitList().stream().forEach(fruit -> System.out.println("Name: " + fruit.getFruitName() + "\n"
                + "Color: " + fruit.getFruitColor() + "\n" + "Size: " + fruit.getFruitSize()));
        System.out.println();
    }

    public void displayBasketShelfDetails() {
        displayShelfList();
    }

    public void getColorList() {
        setBasketColorList(new ArrayList<>(getTotalShelf()));

        for (Map.Entry<String, String> map : FruitBowl.getHashColor().entrySet()) {
            getBasketColorList().add(map.getKey());
        }

    }

    public void getSizeList() {
        setBasketSizeList(new ArrayList<>(getTotalShelf()));

        for (Map.Entry<String, String> map : FruitBowl.getHashSize().entrySet()) {
            getBasketSizeList().add(String.valueOf(map.getKey()));
        }

    }

    @Override
    public void add(Object fruit) {
    }

    public void sortAndTransfer(ArrayList<Fruit> fruitBowlList) {
        for (ShelfBowl shelf : getShelves()) {
            for (Fruit fruit : fruitBowlList) {
                if (shelf.getColor().equalsIgnoreCase(fruit.getFruitColor()))
                    shelf.getShelfFruitList().add(fruit);
                if (shelf.getSize().equalsIgnoreCase(fruit.getFruitSize()))
                    shelf.getShelfFruitList().add(fruit);
            }
        }

    }

    public static ArrayList<Fruit> getBasketFruitList() {

        return BasketFruitList;
    }

    public void setBasketFruitList(ArrayList<Fruit> basketFruitList) {
        BasketFruitList = basketFruitList;
    }

    public ShelfBowl[] getShelves() {
        return shelves;
    }

    public void setShelves(ShelfBowl[] shelves) {
        this.shelves = shelves;
    }

    public List<String> getBasketColorList() {
        return BasketColorList;
    }

    public void setBasketColorList(List<String> basketColorList) {
        this.BasketColorList = basketColorList;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public List<String> getBasketSizeList() {
        return BasketSizeList;
    }

    public void setBasketSizeList(List<String> basketSizeList) {
        BasketSizeList = basketSizeList;
    }

    @Override
    public void add(ArrayList<Object> objectList) {

    }

    @Override
    public void remove(Object objects) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void transferAllContent(Bowl toBowl) {


    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object objects) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }

}
