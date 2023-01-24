package Runner;

import Objects.BasketStand;
import Objects.Bowl;
import Objects.Fruit;
import Objects.FruitBowl;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Fruit Apple = new Fruit("Apple", "Red", "2");
        Fruit Orange = new Fruit("Orange", "Saffron", "1");
        Fruit Grapes = new Fruit("Grapes", "Red", "1");
        Fruit Mango = new Fruit("Mango", "Yellow", "2");

        FruitBowl MyFruitBowl = new FruitBowl();

        MyFruitBowl.add(Apple);
        MyFruitBowl.add(Grapes);
        MyFruitBowl.add(Orange);
        MyFruitBowl.add(Mango);
        MyFruitBowl.showFruitBowlContent();
        BasketStand MyBasketStand = new BasketStand("color"); // "color" or "size"
        MyBasketStand.displayBasketShelfDetails();


        MyFruitBowl.transferSortAllContent(MyBasketStand);
        MyBasketStand.showBasketStandContent();
        MyBasketStand.displayBasketShelfDetails();
//
    }
}