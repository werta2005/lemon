package lesson10.music;

public class Trumpet implements Instrument {
    private int diameter = 3;
    private String name;

    public Trumpet(String name) {
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
        System.out.println("Играет " + name + " диаметром " + diameter);
    }
}
