package lesson16;

import java.util.HashMap;
import java.util.Map;

public class AnimalDemo {
    public static void main(String[] args) {
        Map<String, Pet> animal = new HashMap<>();
        animal.put("Tom", new Cat("Tom"));
        animal.put("Kesha", new Parrot("Kesha"));
        animal.put("Tuzik", new Dog("Tuzik"));

        for (Map.Entry<String,Pet> pet : animal.entrySet()){

            System.out.print(pet.getKey() + ": ");
            System.out.println(pet.getValue());
        }
    }
}
