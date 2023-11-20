package com.example.codingtest.Graph.TopologySort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for(int i = 0; i<= N; i++){
            A.add(new ArrayList<>());
        }
        int[] degree = new int[N+1];
        for(int i =1; i<=M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A.get(S).add(E);
            degree[E]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =1; i<=N; i++){
            if(degree[i] == 0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for(int next : A.get(now)){
                degree[next]--;
                if(degree[next] == 0){
                    queue.add(next);
                }
            }
        }
    }
}
