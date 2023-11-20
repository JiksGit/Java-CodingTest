package com.example.codingtest.Graph.Floyd_Warshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindLoad_11403 {
    public static int D[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        D = new int[N+1][N+1];

        for(int i =1; i<= N; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j =1; j<= N; j++){
                D[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int k =1; k<=N; k++){
            for(int i =1; i<= N; i++){
                for(int j =1; j<= N; j++){
                    if (D[i][k] == 1 && D[k][j] == 1) {
                        D[i][j] = 1;
                    }
                }
            }
        }
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
