package com.example.codingtest.Graph.Graph_Expression;

import java.io.*;
import java.util.*;

public class Hacking {
    static int N, M;
    static int answer[];
    static boolean visited[];
    static ArrayList<Integer> A[];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        answer = new int[N+1];

        for(int i=1; i<=N; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
        }
        int Maximum = 0;
        //BFS
        for(int i=1; i<=N; i++){
            visited = new boolean[N+1];
            BFS(i);
        }
        for(int i=1; i<=N; i++){
            Maximum = Math.max(Maximum, answer[i]);
        }
        for(int i=1; i<=N; i++) {
            if (answer[i] == Maximum) {
//                System.out.print(i + " ");
                bw.write(i+" ");
            }
        }
        bw.flush();
        bw.close();
    }
    public static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(Node);
        visited[Node] = true;
        while(!queue.isEmpty()){
            int now = queue.poll();
            for(int temp: A[now]){
                if(!visited[temp]){
                    visited[temp] = true;
                    answer[temp]++;
                    queue.add(temp);
                }
            }
        }
    }
}
