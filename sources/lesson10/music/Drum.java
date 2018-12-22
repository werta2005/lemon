package lesson10.music;

public class Drum implements Instrument {
    private int size = 4;
    private String name;

    public Drum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Играет " + name + " c " + size + " размером");
    }
}
