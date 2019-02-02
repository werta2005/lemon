package lesson10.season;

import lesson10.season.Season;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season1 = Season.SUMMER;
        Season season2 = Season.valueOf("SUMMER");
        System.out.println(season1);
        System.out.println(season2);
        printSeason(season1);
        printAllValues();

        for (Season season : Season.values())
            System.out.println(season + " " + season.getTmp() + " " + season.getDescription());
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;

        }
    }

    public static void printAllValues() {
        Season[] seasons = Season.values();
        for (Season season : seasons)
            System.out.println(season);
    }
}

