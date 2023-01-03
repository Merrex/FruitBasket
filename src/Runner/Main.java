package Runner;

import Objects.BasketStand;
import Objects.Bowl;
import Objects.Fruit;
import Objects.FruitBowl;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Object Apple = new Fruit("Apple", "Red", 2);
        Object Orange=new Fruit("Orange", "Saffron", 3);

        FruitBowl MyFruitBowl = new FruitBowl();
        BasketStand MyBasketStand = new BasketStand(7, 5, "colorb ");

        MyFruitBowl.add(Apple);
        MyFruitBowl.add(Orange);
        MyFruitBowl.showFruitBowlContent();

        //MyBasketStand.add(Apple);

        MyFruitBowl.transferAllContent(MyFruitBowl, MyBasketStand);
        MyBasketStand.showBasketStandContent();
        MyFruitBowl.showFruitBowlContent();
    }
}