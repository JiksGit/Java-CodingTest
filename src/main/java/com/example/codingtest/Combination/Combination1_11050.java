package com.example.codingtest.Combination;

import java.util.Scanner;

public class Combination1_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int comb[][] = new int[N+1][N+1];
        for(int i =0; i<= N; i++){
            comb[i][0] = 1;
            comb[i][1] = i;
            comb[i][i] = 1;
        }

        for(int i=2; i<=N;i++){
            for(int j=1; j<i; j++){
                comb[i][j] = comb[i-1][j] + comb[i-1][j-1];
            }
        }
        System.out.println(comb[N][K]);
    }
}
