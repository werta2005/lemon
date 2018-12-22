package lesson10.music;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar("Guitar"), new Drum("Drum"), new Trumpet("Trumpet")};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
