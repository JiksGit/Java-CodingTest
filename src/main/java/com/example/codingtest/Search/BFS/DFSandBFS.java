package com.example.codingtest.Search.BFS;

import java.util.*;

public class DFSandBFS {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Start = sc.nextInt();
        A = new ArrayList[N+1];
        for(int i = 1; i<= N; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            A[S].add(E);
            A[E].add(S);
        }
        for (int i=1; i<= N; i++){
            Collections.sort(A[i]);
        }
        visited = new boolean[N+1];
        DFS(Start);
        System.out.println();
        visited = new boolean[N+1];
        BFS(Start);
        System.out.println();
    }

    public static void DFS(int Node) {
        System.out.print(Node + " ");
        visited[Node] = true;
        for(int i : A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

    public static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            visited[now] = true;
            for(int i: A[now]){
                if(!visited[i]){
                    visited[i]= true;
                    queue.add(i);
                }
            }
        }
    }
}
