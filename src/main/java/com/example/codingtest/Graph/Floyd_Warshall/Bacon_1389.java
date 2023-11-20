package com.example.codingtest.Graph.Floyd_Warshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bacon_1389 {
    public static int[][] D;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        D = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            for(int j =1; j<= N; j++){
                if(i==j) D[i][j] = 0;
                else D[i][j] = 10000001;
            }
        }

        for(int i =1; i<= M; i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            D[a][b] = 1;
            D[b][a] = 1;
        }

        for(int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if(D[i][j] > D[i][k] + D[k][j])
                    D[i][j] = D[i][k] + D[k][j];
                }
            }
        }
        int[] sum = new int[N+1];

        for(int i=1; i<= N; i++) {
            for (int j = 1; j <= N; j++) {
                if( i== j) continue;
                else{
                    sum[i] += D[i][j];
                }
            }
        }
        int min = sum[1];
        int num = 1;
        for(int i=2; i<= N; i++){
            if(min > sum[i]) {
                min = sum[i];
                num = i;
            }
        }
        System.out.println(num);

    }
}
