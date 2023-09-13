package com.example.codingtest.Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        //이부분 이해하고 암기
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) ->{
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second)
                return o1 > o2 ? 1: -1;
            else
                return first - second;
        });

        for (int i=0; i<N; i++){
            int request = Integer.parseInt(bf.readLine());
            if (request == 0){
                if(MyQueue.isEmpty()){
                    System.out.println("0");
                }
                else System.out.println(MyQueue.poll());
            } else {
                MyQueue.add(request);
            }
        }

    }
}
