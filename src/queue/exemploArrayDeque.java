package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class exemploArrayDeque {
    public static void main(String[] args) {
        acessandoDaFila();
    }

    public static void acessandoDaFila() {
        System.out.println("**** acessandoDaFila ****");
        Deque<String> nextDeque = new ArrayDeque<String>();
        nextDeque.add("red");
        nextDeque.add("blue");
        nextDeque.add("white");
        nextDeque.add("Yellow");
        nextDeque.add("Black");

        Deque<String> nextDeque2 = new ArrayDeque<String>();
        nextDeque2.add("green");
        nextDeque2.add("orange");

        nextDeque.addAll(nextDeque2);

        nextDeque.removeFirst();
        nextDeque.removeLast();

        System.out.println(nextDeque);
        System.out.println(nextDeque.contains("white"));
        System.out.println(nextDeque2.contains("Brown"));
    }
}
