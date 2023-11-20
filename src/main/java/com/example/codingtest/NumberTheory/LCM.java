package com.example.codingtest.NumberTheory;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int result = gcd(M, N);
        for(int i=0; i< result; i++){
            System.out.print("1");
        }
    }
    public static int gcd(int m , int n){
        if(n == 0) return m;
        else {
            return gcd(n , m%n);
        }
    }
}
