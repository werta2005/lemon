package lesson9.circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(21);
        Circle circle2 = new Circle(12);

        System.out.println("Длина 1-й окружности равна " + circle1.length());
        System.out.println("Площадь 1-й окружности равна " + circle1.square());
        System.out.println("Длина 2-й окружности равна " + circle2.length());
        System.out.println("Площадь 2-й окружности равна " + circle2.square());
    }
}
