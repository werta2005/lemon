package lesson9.fruit;

import lesson9.fruit.Fruit;

public class Pear extends Fruit {
    private int weight;
    private static int price = 6;

    public Pear(int weight) {
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
