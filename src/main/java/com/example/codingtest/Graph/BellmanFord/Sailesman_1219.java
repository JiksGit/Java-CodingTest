package com.example.codingtest.Graph.BellmanFord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sailesman_1219 {
    static int N, S, E, M;
    static Edge1 edges[];
    static long distance[];
    static long money[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges = new Edge1[M];
        distance = new long[N];
        money = new long[N];
        Arrays.fill(distance, Long.MIN_VALUE);

        for(int i = 0; i< M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            edges[i] = new Edge1(s, e, t);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< N; i++){
            money[i] = Integer.parseInt(st.nextToken());
        }
        distance[S] = money[S];
        //벨만포드
        for(int i = 0; i<= N + 100; i++){
            for(int j = 0; j<M; j++){
                Edge1 edge = edges[j];
                if(distance[edge.start] == Long.MIN_VALUE) continue;
                else if(distance[edge.start] == Long.MAX_VALUE)
                    distance[edge.end] = Long.MAX_VALUE;
                else if (distance[edge.end] < distance[edge.start] + money[edge.end] - edge.tmoney){
                    distance[edge.end] = distance[edge.start] + money[edge.end] - edge.tmoney;
                    if(i >= N - 1) distance[edge.end] = Long.MAX_VALUE;
                }
            }
        }
        if(distance[E] == Long.MIN_VALUE) System.out.println("gg");
        else if (distance[E] == Long.MAX_VALUE) System.out.println("Gee");
        else System.out.println(distance[E]);
    }
}
class Edge1 {
    int start, end, tmoney;
    public Edge1(int start, int end, int tmoney){
        this.start = start;
        this.end = end;
        this.tmoney = tmoney;
    }
}
