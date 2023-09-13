package com.example.codingtest.Greedy;

import java.util.Scanner;

public class MinimumBatch {
    static int answer = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("-");
        for (int i =0; i < str.length; i++){
            int temp = mySum(str[i]);

            if(i==0){
                answer = temp;
            } else{
                answer -= temp;
            }
        }
        System.out.println(answer);
    }
    static int mySum(String s) {
        int sum =0;
        String[] temp = s.split("[+]");
        for (int i = 0; i<temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }

}
