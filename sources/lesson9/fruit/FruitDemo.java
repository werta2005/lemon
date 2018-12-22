package lesson9.fruit;

public class FruitDemo {
    public static void main(String[] args) {
        Apricot apricot1 = new Apricot(3);
        Apricot apricot2 = new Apricot(2);
        Pear pear1 = new Pear(2);
        Pear pear2 = new Pear(5);
        Apple apple1 = new Apple(4);
        Apple apple2 = new Apple(1);

        int costApricots = apricot1.costFruit() + apricot2.costFruit();
        System.out.println("Продано абрикос: " + costApricots);
        int costPears = pear1.costFruit() + pear2.costFruit();
        System.out.println("Продано груш: " + costPears);
        int costApples = apple1.costFruit() + apple2.costFruit();
        System.out.println("Продано яблок: " + costApples);

        int totalCost = costApples + costApricots + costPears;
        System.out.println("Всего: " + totalCost);
    }
}
