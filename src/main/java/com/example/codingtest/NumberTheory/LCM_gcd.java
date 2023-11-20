package com.example.codingtest.NumberTheory;

import java.util.Scanner;

public class LCM_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        for(int i=0; i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a * b / gcd(a,b);
            System.out.println(result);
        }
    }
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        else return gcd(b, a%b);
    }
}

