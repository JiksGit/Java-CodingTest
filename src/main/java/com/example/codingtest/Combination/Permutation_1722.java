package com.example.codingtest.Combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation_1722 {
    public static void main(String[] args) throws IOException {
        int N, Q;
        long F[] = new long[21];
        int S[]= new int[21];
        boolean visited[] = new boolean[21];
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        Q = Integer.parseInt(st.nextToken());
        F[0] = 1;
        for(int i = 1; i<= N; i++){  //각 자릿수에서 만들 수 있는 경우의 수
            F[i] = F[i-1] * i ;
        }

        if(Q == 1){
            long K = Long.parseLong(st.nextToken());
            for(int i= 1; i<= N; i++){
                for(int j = 1, cnt = 1; j<= N; j++){
                    if(visited[j]) continue;
                    if(K <= cnt * F[N - i]){  //K가

                    }
                }
            }
        }
    }
}
