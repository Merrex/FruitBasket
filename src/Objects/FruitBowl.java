package Objects;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class FruitBowl implements Bowl {

    public static ArrayList<Fruit> FruitBowlList;

    public void showFruitBowlContent(){

        System.out.println("Fruit Bowl Content \n");
        FruitBowlList.stream().forEach(fruit -> System.out.println("Name: "+fruit.fruitName+"\n"
                +"Color: "+fruit.fruitColor+"\n"+"Size: "+fruit.fruitSize));
        System.out.println();
    }

    public FruitBowl(){
        FruitBowlList=new ArrayList<Fruit>();
    }
    @Override
    public void add(Object fruit) {
        FruitBowlList.add((Fruit) fruit);

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
    public void transferAllContent(Bowl fromBowl, Bowl toBowl) {
        if(BasketStand.BasketFruitList.isEmpty()){
            BasketStand.BasketFruitList.addAll(FruitBowlList);//access through methods
            FruitBowlList.clear();
            //System.out.println(BasketStand.BasketFruitList.get(0).fruitName);
        }

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object objects) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }
}
