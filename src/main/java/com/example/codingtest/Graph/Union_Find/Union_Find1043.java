package com.example.codingtest.Graph.Union_Find;

import java.util.ArrayList;
import java.util.Scanner;

public class Union_Find1043 {
    public static int[] parent;
    public static int[] trueP;
    public static ArrayList<Integer>[] party;
    public static int result;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        result  = 0;
        trueP = new int[T];
        for (int i = 0; i< T; i++){
            trueP[i] = sc.nextInt();
        }
        party = new ArrayList[M];
        for(int i = 0; i<M; i++){
            party[i] = new ArrayList<Integer>();
            int party_size = sc.nextInt();
            for(int j = 0; j< party_size; j++){
                party[i].add(sc.nextInt());
            }
        }
        parent = new int[N+1];
        for(int i = 1; i<=N; i++){
            parent[i] = i;
        }
        for(int i= 0; i<M ; i++){
            int firstPeople = party[i].get(0);
            for (int j = 1; j<party[i].size(); j++){
                union(firstPeople, party[i].get(j));
            }
        }
        for(int i=0; i<M; i++){
            boolean isPossible = true;
            int cur = party[i].get(0);
            for (int j = 0; j< trueP.length; j++){
                if (find(cur) == find(trueP[j])){
                    isPossible =false;
                    break;
                }
            }
            if(isPossible) result++;
        }
    }
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if ( a != b){
            parent[b] =a;
        }
    }
    public static int find(int a){
        if (a == parent[a])
            return a;
        else{
            return parent[a] = find(parent[a]);
        }
    }
}
