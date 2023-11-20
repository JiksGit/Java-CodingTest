package com.example.codingtest.Graph.Floyd_Warshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastBus_11404 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int D[][] = new int[N+1][N+1];
        for(int i =1; i<= N;i++){
            for(int j =1; j<= N; j++){
                if(i==j) D[i][j] = 0;
                else D[i][j] = 10000001;
            }
        }

        for(int i=0; i< M; i++){
            StringTokenizer sc = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(sc.nextToken());
            int e = Integer.parseInt(sc.nextToken());
            int t = Integer.parseInt(sc.nextToken());
            if(D[s][e] > t) D[s][e] = t;
        }

        for(int k=1; k<= N; k++){
            for(int i=1; i<= N; i++){
                for(int j=1; j<= N; j++){
                    D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }

        for(int i =1; i<= N;i++){
            for(int j =1; j<= N; j++){
                if(D[i][j] == 10000001) System.out.print("0 ");
                else System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }
}
