package lesson10.season;

public enum Season {
    WINTER(-10), SPRING(10), SUMMER(30) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(15);

    private double tmp;

    Season(double tmp) {
        this.tmp = tmp;
    }

    public double getTmp() {
        return tmp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
