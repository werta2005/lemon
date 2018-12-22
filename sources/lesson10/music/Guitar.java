package lesson10.music;

public class Guitar implements Instrument {
    private int quantity = 7;
    private String name;

    public Guitar(String name) {
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
        System.out.println("Играет " + name + " c " + quantity + " струнами");
    }
}
