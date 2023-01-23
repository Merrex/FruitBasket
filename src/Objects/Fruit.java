package Objects;

public class Fruit {

private String fruitName;//encapsulate properties
private String fruitColor;
private String fruitSize;//determine accessibilty

public Fruit(String fruitName, String fruitColor, String fruitSize){
    this.setFruitName(fruitName);
    this.setFruitColor(fruitColor);
    this.setFruitSize(fruitSize);

}

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitColor() {
        return fruitColor;
    }

    public void setFruitColor(String fruitColor) {
        this.fruitColor = fruitColor;
    }

    public String getFruitSize() {
        return fruitSize;
    }

    public void setFruitSize(String fruitSize) {
        this.fruitSize = fruitSize;
    }
}
