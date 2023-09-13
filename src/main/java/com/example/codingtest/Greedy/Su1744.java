package com.example.codingtest.Greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Su1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int one = 0;
        int zero = 0;
        int sum = 0;
        PriorityQueue<Integer> plusQ= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusQ = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int data = sc.nextInt();
            if(data >1){
                plusQ.add(data);
            } else if(data == 1){
                one++;
            } else if(data == 0){
                zero++;
            } else{
                minusQ.add(data);
            }
        }

        while(plusQ.size() >1){
            int data1 = plusQ.remove();
            int data2 = plusQ.remove();
            sum += data1 * data2;
        }
        if(plusQ.size() != 0){
            sum += plusQ.remove();
        }

        while(minusQ.size() >1){
            int data1 = minusQ.remove();
            int data2 = minusQ.remove();
            sum += data1 * data2;
        }
        if(minusQ.size() != 0){
            if(zero == 0) {
                sum += minusQ.remove();
            }
        }

        sum += one;
        System.out.println(sum);
    }
}
