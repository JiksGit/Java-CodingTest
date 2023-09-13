package com.example.codingtest.Greedy;

import java.util.Scanner;

public class CoinMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int target = sc.nextInt();
        int[] A = new int[N];
        for (int i =0; i< N; i++){
            A[i] = sc.nextInt();
        }

        for(int j = N-1; j>=0; j--){
            if(target >= A[j]){
                count += (target / A[j]);
                target %= A[j];
            }
        }
        System.out.println(count);
    }
}
