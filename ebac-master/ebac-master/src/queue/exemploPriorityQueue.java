package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class exemploPriorityQueue {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0) 
            System.out.println(queue.remove());
    }
}