package com.example.codingtest.Combination;

import java.util.Scanner;

public class Bansang_2775 {
    static int D[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int p=0; p< N; p++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            D = new int[k+1][n+1];

            for(int i=0; i<= k; i++){
                for(int j =1; j<= n; j++){
                    D[0][j] = j;
                    D[i][1] = 1;
                }
            }

            for(int i=1; i<= k; i++){
                for(int j =2; j<= n; j++){
                    D[i][j] = D[i][j-1] + D[i-1][j];
                }
            }
            System.out.println(D[k][n]);
        }
    }
}
