package com.example.codingtest.Graph.Dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class LeastCost_1916 {
    public static boolean visited[];
    public static int[] distance;
    public static ArrayList<Dosi> list[];
    public static int N, M, S, E;
    public static PriorityQueue<Dosi> queue= new PriorityQueue<Dosi>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 도시 개수(노드)
        M= Integer.parseInt(br.readLine()); // 버스 개수(거리)
        StringTokenizer st;
        distance = new int[N+1];
        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<=N; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i =1; i<= M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()); // 출발 도시
            int v = Integer.parseInt(st.nextToken()); // 도착 도시
            int w = Integer.parseInt(st.nextToken()); // 비용
            list[u].add(new Dosi(v, w));
        }
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        queue.add(new Dosi(S,0));
        distance[S] = 0;

        while(!queue.isEmpty()){
            Dosi now = queue.poll();
            int n_v = now.vertex;
            if(visited[n_v]) continue;
            visited[n_v] = true;

            for(int i=0; i<list[n_v].size(); i++){
                Dosi next = list[n_v].get(i);
                if(distance[next.vertex] > distance[n_v] + next.cost) {
                    distance[next.vertex] = distance[n_v] + next.cost;
                    queue.add(new Dosi(next.vertex, distance[next.vertex]));
                }
            }
        }
        System.out.println(distance[E]);
    }
}
class Dosi implements Comparable<Dosi>{
    int vertex;
    int cost;

    Dosi(int vertex, int cost){
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Dosi o) {
        if(this.cost > o.cost) return 1;
        else return -1;
    }
}
