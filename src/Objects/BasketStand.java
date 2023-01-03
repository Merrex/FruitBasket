package Objects;

import java.util.ArrayList;

public class BasketStand extends ShelfBowl implements Bowl{

    public ShelfBowl[] Shelf;
    public static ArrayList<Fruit> BasketFruitList;

    public void showBasketStandContent(){
        System.out.println("Basket Stand Content \n");
        BasketFruitList.stream().forEach(fruit -> System.out.println("Name: "+fruit.fruitName+"\n"
                +"Color: "+fruit.fruitColor+"\n"+"Size: "+fruit.fruitSize));
        System.out.println();
    }


    public BasketStand(int totalShelf, int shelfSize, String sortBy){
        ShelfSize=shelfSize;
        this.Shelf = new ShelfBowl[totalShelf];
        BasketFruitList=new ArrayList<Fruit>();
        this.sortBy=sortBy;

    }
    @Override
    public void add(Object fruit) {
        BasketFruitList.add((Fruit) fruit);

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

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object objects) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }
}
