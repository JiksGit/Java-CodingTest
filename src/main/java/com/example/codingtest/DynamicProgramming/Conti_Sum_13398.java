package com.example.codingtest.DynamicProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class Conti_Sum_13398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] D = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i< N;i++){
            D[i] = Integer.parseInt(st.nextToken());
        }

        int[] L = new int[N];
        int[] R = new int[N];
        int result = D[0];
        L[0]= D[0];
        R[N-1] = D[N-1];

        for(int i=1; i< N; i++){
            L[i] = Math.max(L[i-1]+D[i], D[i]);
            result = Math.max(result, L[i]);
        }
        for(int i=N-2; i>=0; i--){
            R[i] = Math.max(R[i+1]+D[i], D[i]);
        }

        for(int i=1; i<N-1; i++){
            result = Math.max(result, L[i-1] + R[i+1]);
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
