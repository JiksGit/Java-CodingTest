package com.example.codingtest.Tree.Tree_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LeafNode_Count_1068 {
    static int N, M;
    static int answer;
    static ArrayList<Integer> tree[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        visited = new boolean[N];
        int root = 0;

        for (int i =0; i<tree.length; i++){
            tree[i] = new ArrayList<>();
        }
        StringTokenizer st= new StringTokenizer(br.readLine());

        for(int i = 0; i< N; i++){
            int s = Integer.parseInt(st.nextToken());
            if(s != -1) {
                tree[s].add(i);
                tree[i].add(s);
            } else
                root = i;
        }
        M = Integer.parseInt(br.readLine());
        answer = 0;
        if(M == root){
            System.out.println(0);
        }
        else {
            DFS(root);
            System.out.println(answer);
        }
    }
    public static void DFS(int number) {
        visited[number] = true;
        int cNode = 0;
        for (int i : tree[number]){
            if(visited[i] == false && i != M){
                cNode++;
                DFS(i);
            }
        }
        if(cNode == 0) answer++;
    }
}
