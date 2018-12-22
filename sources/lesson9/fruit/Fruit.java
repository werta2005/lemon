package lesson9.fruit;

public abstract class Fruit {
    int weight;

    public final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    abstract int costFruit();

}
