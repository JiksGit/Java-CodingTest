package com.example.codingtest.Graph.Minimum_Spanning_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mini_Span_tree_1197 {
    public static PriorityQueue<Edge> queue;
    public static int[] union;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        union = new int[N+1];
        for(int i =1; i<= N; i++){
            union[i] = i;
        }
        queue = new PriorityQueue<>();

        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int vertex = Integer.parseInt(st.nextToken());
            queue.add(new Edge(start,end,vertex));
        }

        int useEdge = 0;
        int sum = 0;
        while(useEdge < N -1) {
            Edge edge = queue.poll();
            if(find(edge.s) != find(edge.e)){
                union(edge.s, edge.e);
                sum += edge.v;
                useEdge++;
            }
        }
        System.out.println(sum);
    }
    public static void union(int a, int b){
        a = find(a);
        b = find(b);
        if (a!=b){
            union[b] = a;
        }
    }
    public static int find(int s){
        if(s == union[s]) return s;
        else return union[s] = find(union[s]);
    }
}
class Edge implements Comparable<Edge>{
    int s, e, v;
    Edge(int s, int e, int v){
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compareTo(Edge o) {
        return this.v - o.v;
    }
}
