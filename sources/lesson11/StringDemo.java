package lesson11;

public class StringDemo {
    public static void main(String[] args) {
      compareStrings("I like Java!!!");
        compareStrings("I like .Net!!!");
        printLastCharacter("I like .Net!!!");
    }
    public static void compareStrings(String str){
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));

    }
    public static void printLastCharacter(String str){
        System.out.println(str.charAt(str.length()-1));



    }
}
