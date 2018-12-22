package lesson9.fruit;

public class Apricot extends Fruit {
    private int weight;
    private static int price = 4;

    public Apricot(int weight) {
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
