package com.example.codingtest.Sort;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] A = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            A[i] = Integer.parseInt(s.substring(i,i+1));
        }

        for (int i=0; i< s.length(); i++){
            int Max = A[i];
            int q = 0;
            for (int j = i+1; j<s.length(); j++){
                if(A[j] > Max){
                    Max = A[j];
                    q = j;
                }
            }
            if(A[i] < Max) {
                int temp = A[i];
                A[i] = Max;
                A[q] = temp;
            }
        }
        for(int i=0; i<s.length(); i++){
            System.out.print(A[i]);
        }
    }
}
