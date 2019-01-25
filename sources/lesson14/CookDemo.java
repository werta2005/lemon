package lesson14;

public class CookDemo {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable(){
            @Override
            public void cook() {
                System.out.println("Жарка");
            }
        });
    }
}
