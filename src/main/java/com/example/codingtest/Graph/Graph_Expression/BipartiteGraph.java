package com.example.codingtest.Graph.Graph_Expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BipartiteGraph{
    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean visited[];
    static boolean isEven;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testcount = Integer.parseInt(bf.readLine());
        for(int e = 0; e<testcount; e++){
            String[] s= bf.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);

            A = new ArrayList[N+1];
            visited = new boolean[N+1];
            check = new int[N+1];
            isEven = true;
            for(int i = 1; i<=N; i++){
                A[i] = new ArrayList<Integer>();
            }

            for(int j=1; j<=E; j++){
                s= bf.readLine().split(" ");
                int S = Integer.parseInt(s[0]);
                int F = Integer.parseInt(s[1]);
                A[S].add(F);
                A[F].add(S);
            }

            for(int t = 1 ; t<=N; t++){
                if(isEven)
                    DFS(t);
                else
                    break;
            }
            if(isEven) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    private static void DFS(int Node){
        visited[Node] = true;
        for(int i: A[Node]){
            if(!visited[i]){
                check[i] = (check[Node]+1) % 2;
                DFS(i);
            }
            else if(check[i] == check[Node]){
                isEven = false;
            }
        }
    }
}
