package com.example.codingtest.DynamicProgramming;

import java.util.Scanner;

public class TopDown_Pibo_2747 {
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        D = new int[n+1];
        for (int i =0; i<=n; i++){
            D[i] = -1;
        }
        D[0] = 0;
        D[1] = 1;
        fibo(n);
        System.out.println(D[n]);
    }

    private static int fibo(int n) {
        if (D[n] != -1) return D[n];
        return D[n] = fibo(n-1) + fibo(n-2);
    }
}
