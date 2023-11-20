package com.example.codingtest.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD_Oiler {
    public static void main(String[] args) throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        long result = n;
        for (long p=2; p<= Math.sqrt(n); p++){
            if(n % p == 0){
                result = result - result / p;
                while( n % p == 0){
                    n = n / p;
                }
            }
        }
        if (n > 1){
            result = result - result / n;
        }
        System.out.println(result);
    }
}
