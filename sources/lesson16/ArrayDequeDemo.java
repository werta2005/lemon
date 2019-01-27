package lesson16;

import oop.HeavyBox;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo
{
    public static void main(String[] args) {
        Deque<HeavyBox> queue = new ArrayDeque<>();
        queue.offer(new HeavyBox(1,2,1,1));
        queue.offer(new HeavyBox(4,2,1,1));
        queue.offer(new HeavyBox(1,3,1,13));
        queue.offer(new HeavyBox(1,8,1,1));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
