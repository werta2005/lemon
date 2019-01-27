package lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1, 2, 1, 1));
        list.add(new HeavyBox(4, 2, 1, 1));
        list.add(new HeavyBox(1, 3, 1, 13));
        list.add(new HeavyBox(1, 8, 1, 1));
        List<HeavyBox> heavyBoxes = findTooHeavyBoxes(list);
        System.out.println(list);
        System.out.println(heavyBoxes);
    }

    private static List<HeavyBox> findTooHeavyBoxes(List<HeavyBox> list) {
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.weight > 300) {
                iterator.remove();
                result.add(box);
            }
        }

        return result;
    }
}
