package com.example.codingtest.Graph.TopologySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(); // 건물 순서 arraylist
        int time[] = new int[N+1]; // 자기 건물 걸리는 시간
        int answer[] = new int[N+1]; // 답 배열
        int indegree[] = new int[N+1]; // 위상 정렬 배열
        for(int i =0; i<=N; i++){
            A.add(new ArrayList<>());
        }

        for(int i=1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            while(true){
                int temp = Integer.parseInt(st.nextToken());
                if(temp == -1) break;
                A.get(temp).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i<= N; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int n = queue.poll();
            for(int next : A.get(n)){
                indegree[next]--;
                //A가 20초 B가 10초 걸리면 그전에 A가 20초이므로 최댓값을 리턴
                answer[next] = Math.max(answer[next], answer[n]+ time[n]);
                if(indegree[next] == 0){
                    queue.add(next);
                }
            }
        }
        for(int i =1; i<=N; i++){
            System.out.println(time[i] + answer[i]);
        }
    }
}
