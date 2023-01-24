package Objects;

import java.util.ArrayList;
import java.util.HashMap;

public class FruitBowl implements Bowl {

    private ArrayList<Fruit> FruitBowlList;
    private static HashMap<String, String> hashColor;
    private static HashMap<String, String> hashSize;

    public FruitBowl() {
        setFruitBowlList(new ArrayList<>());
        setHashColor(new HashMap<>());
        setHashSize(new HashMap<>());
    }

    public void showFruitBowlContent() {

        System.out.println("Fruit Bowl Content \n");
        getFruitBowlList().stream().forEach(fruit -> System.out.println("Name: " + fruit.getFruitName() + "\n"
                + "Color: " + fruit.getFruitColor() + "\n" + "Size: " + fruit.getFruitSize()));
        System.out.println(getHashColor().entrySet());
    }

    public void transferSortAllContent(BasketStand toBasket) {
        if (BasketStand.getBasketFruitList().isEmpty()) {

            toBasket.sortAndTransfer(getFruitBowlList());
            getFruitBowlList().clear();

        } else {
            BasketStand.getBasketFruitList().clear();
            toBasket.sortAndTransfer(getFruitBowlList());
            getFruitBowlList().clear();

        }


    }

    @Override
    public void add(Object fruit) {
        getFruitBowlList().add((Fruit) fruit);
        getHashColor().put(((Fruit) fruit).getFruitColor(), ((Fruit) fruit).getFruitName());
        getHashSize().put(((Fruit) fruit).getFruitSize(), ((Fruit) fruit).getFruitName());
    }

    public ArrayList<Fruit> getFruitBowlList() {
        return FruitBowlList;
    }

    public static HashMap<String, String> getHashSize() {
        return hashSize;
    }

    public static void setHashSize(HashMap<String, String> hashSize) {
        FruitBowl.hashSize = hashSize;
    }


    public void setFruitBowlList(ArrayList<Fruit> fruitBowlList) {
        FruitBowlList = fruitBowlList;
    }

    public static HashMap<String, String> getHashColor() {
        return hashColor;
    }

    public void setHashColor(HashMap<String, String> hashColor) {
        this.hashColor = hashColor;
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
