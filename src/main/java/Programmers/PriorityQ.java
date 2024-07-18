package Programmers;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(20);

        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);

        pq.addAll(list);

        System.out.println(pq);
    }
}
