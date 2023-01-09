package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BasketStand extends ShelfBowl implements Bowl{


    public static ArrayList<Fruit> BasketFruitList;
    public ShelfBowl[] shelves;
    public static int TotalShelf;
    public List<String> getShelfColor;

    public void showBasketStandContent(){
        System.out.println("Basket Stand Content \n");
        BasketFruitList.stream().forEach(fruit -> System.out.println("Name: "+fruit.fruitName+"\n"
                +"Color: "+fruit.fruitColor+"\n"+"Size: "+fruit.fruitSize));
        System.out.println();
    }

    public void displayBasketShelfDetails(){
        displayShelfList();
    }


    public BasketStand(String sortBy){
        //ShelfSize=shelfSize;//ShelfBowl Class
        if(sortBy.equalsIgnoreCase("color")) {
            TotalShelf = FruitBowl.hashColor.size();//BasketStand Class
            shelves = new ShelfBowl[TotalShelf];
            BasketFruitList=new ArrayList<Fruit>(Fruit.FRUITLIST.size());
            assignShelfProperties(sortBy);


        }


    }

    public void assignShelfProperties(String sortBy){

            getColorList();
        for(int i=0;i<TotalShelf;i++){
            shelves[i]=new ShelfBowl();
            shelves[i].ShelfFruitList=new ArrayList<Fruit>();
            BasketFruitList.addAll(shelves[i].ShelfFruitList);
            shelves[i].ShelfNumber=i+1;
            shelves[i].sortBy= sortBy;
            shelves[i].color= getShelfColor.get(i);

        }
        System.out.println(shelves.length);
    }

    public void getColorList (){
        getShelfColor=new ArrayList<String>(TotalShelf);

        for (Map.Entry<String, String> map : FruitBowl.hashColor.entrySet()) {
            getShelfColor.add(map.getKey());
        }

        }
    @Override
    public void add(Object fruit) {


    }
    public void sortAndTransfer(ArrayList<Fruit> fruitBowlList){
        for(ShelfBowl shelf: shelves){
            for(Fruit fruit: fruitBowlList)
                if(shelf.color.equalsIgnoreCase(fruit.fruitColor))
                    shelf.ShelfFruitList.add(fruit);
        }

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
    public void transferAllContent( Bowl toBowl) {


    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object objects) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }




}
