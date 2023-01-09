package Objects;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class FruitBowl implements Bowl {

    public static ArrayList<Fruit> FruitBowlList;
    public static HashMap<String, String> hashColor;

    public void showFruitBowlContent(){

        System.out.println("Fruit Bowl Content \n");
        FruitBowlList.stream().forEach(fruit -> System.out.println("Name: "+fruit.fruitName+"\n"
                +"Color: "+fruit.fruitColor+"\n"+"Size: "+fruit.fruitSize));
        System.out.println(hashColor.entrySet());
    }

    public FruitBowl(){
        FruitBowlList=new ArrayList<Fruit>();
        hashColor=new HashMap<String, String>();
    }
    @Override
    public void add(Object fruit) {
        FruitBowlList.add((Fruit) fruit);
        hashColor.put(((Fruit) fruit).fruitColor,((Fruit) fruit).fruitName );

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

    public void transferSortAllContent(BasketStand toBasket) {
        if(BasketStand.BasketFruitList.isEmpty()){
            toBasket.sortAndTransfer(FruitBowlList);

            //BasketStand.BasketFruitList.addAll(FruitBowlList);//access through methods
            FruitBowlList.clear();
            //System.out.println(BasketStand.BasketFruitList.get(0).fruitName);
        }
        else {
            BasketStand.BasketFruitList.clear();
            toBasket.sortAndTransfer(FruitBowlList);
            //access through methods
            FruitBowlList.clear();
        }

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object objects) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }


}
