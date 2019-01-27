package lesson16;

public class HeavyBox {
    int width;
    int height;
    int weight; // вес коробки
    int depth;

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", depth=" + depth +
                '}';
    }
}

