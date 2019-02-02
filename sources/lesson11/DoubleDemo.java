package lesson11;

public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 347.4;
        Double double2 = new Double("3.4");

        Double double3 = Double.valueOf("2.45");
        Double double4 = Double.valueOf(2.4);
        double double5 = Double.parseDouble("3.6");

        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);
        System.out.println(double1.byteValue());
        System.out.println(double1.intValue());
        System.out.println(double1.longValue());
        System.out.println(double1.floatValue());
        System.out.println(double1.shortValue());
        System.out.println(double1.doubleValue());

    }


}
