package Objects;

import java.util.ArrayList;

public class ShelfBowl implements Bowl {

    public ArrayList<Fruit> ShelfFruitList;
    public static int TotalShelf=0;
    public static int ShelfSize;
    public int ShelfNumber;
    public String sortBy;//color, type, size

    public ShelfBowl(int shelfNumber){
        this.ShelfNumber=shelfNumber;
        TotalShelf++;
    }

    public ShelfBowl() {
        ShelfFruitList=new ArrayList<Fruit>();

        new ShelfBowl(TotalShelf);
    }


    @Override
    public void add(Object fruit) {

    }

    @Override
    public void add(ArrayList<Object> objectList) {

    }

    @Override
    public void remove(Object object) {

    }

    @Override
    public void removeAll() {

    }

    @Override
    public void transferAllContent(Bowl fromBowl, Bowl toBowl) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, Object object) {

    }

    @Override
    public void transferContent(Bowl fromBowl, Bowl toBowl, ArrayList<Object> objectList) {

    }
}
