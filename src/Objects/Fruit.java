package Objects;

import java.util.ArrayList;

public class Fruit {

public String fruitName;//encapsulate properties
public String fruitColor;
public int fruitSize;//determine accessibilty
public static ArrayList<Fruit> FRUITLIST= new ArrayList<Fruit>();//remove the array list

public Fruit(String fruitName, String fruitColor, int fruitSize){
    this.fruitName=fruitName;
    this.fruitColor=fruitColor;
    this.fruitSize=fruitSize;
    updateFruitList(this);


}

public void updateFruitList(Fruit fruit){
    FRUITLIST.add(fruit);
}

public static void displayFruitList(){
    System.out.println("Fruit Lists \n");
    FRUITLIST.stream().forEach(fruit -> System.out.println("Name: "+fruit.fruitName+"\n"
            +"Color: "+fruit.fruitColor+"\n"+"Size: "+fruit.fruitSize));
    System.out.println();
}

}
