package lesson9.fruit;

public class Apple extends Fruit {
    private int weight;
    private static int price = 7;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    int costFruit() {
        return weight * price;
    }
}
