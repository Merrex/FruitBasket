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
        Object Grapes=new Fruit("Grapes", "Red", 1);
        Object Mango=new Fruit("Mango", "Yellow", 2);
        Fruit.displayFruitList();
        FruitBowl MyFruitBowl = new FruitBowl();
//
//
       MyFruitBowl.add(Apple);
        MyFruitBowl.add(Grapes);
      MyFruitBowl.add(Orange);
      MyFruitBowl.add(Mango);
        MyFruitBowl.showFruitBowlContent();
//
        BasketStand MyBasketStand = new BasketStand("color");
        MyBasketStand.displayBasketShelfDetails();
//        //MyBasketStand.add(Apple);
//
       MyFruitBowl.transferSortAllContent(MyBasketStand);
        MyBasketStand.showBasketStandContent();
        MyBasketStand.displayBasketShelfDetails();
//        MyFruitBowl.showFruitBowlContent();
    }
}