package com.example.codingtest.Combination;

import java.util.Scanner;

public class Bridge_1010 {
    static long[][] D;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        D = new long[31][31];

        for(int i =0; i< 31; i++){
            D[i][1] = i;
            D[i][0] = 1;
            D[i][i] = 1;
        }
        for(int i = 2; i< 31; i++){
            for(int j = 1; j< i; j++){
                D[i][j] = D[i-1][j-1] + D[i-1][j];
            }
        }

        for(int i =0; i< N; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(D[m][n]);
        }

    }
}

