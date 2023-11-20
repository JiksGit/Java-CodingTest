package com.example.codingtest.Graph.Union_Find;

import java.util.Scanner;

public class Union_Find1976 {
    public static int[] parent;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] dosi = new int[N+1][N+1];
        for(int i =1; i<=N; i++){
            for(int j =1; j<=N; j++){
                dosi[i][j]= sc.nextInt();
            }
        }
        int[] route = new int[M+1];
        for(int i=1; i<=M; i++){
            route[i] = sc.nextInt();
        }
        parent = new int[N+1];
        for(int i= 1; i<=N; i++){
            parent[i] = i;
        }
        for (int i= 1; i<=N; i++){
            for (int j = 1; j<=N; j++){
                if(dosi[i][j] == 1) union(i,j);
            }
        }
        int index = find(route[1]);
        for(int i = 2; i< route.length ;i++){
            if(index != find(route[i])){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void union(int i, int j) {
        i = find(i);
        j = find(j);
        if (i!= j) parent[j] = i;
    }

    public static int find(int i) {
        if(i == parent[i]) return i;
        else {
            return parent[i] = find(parent[i]);
        }
    }

}
