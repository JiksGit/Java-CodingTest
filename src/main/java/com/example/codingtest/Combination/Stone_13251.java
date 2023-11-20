package com.example.codingtest.Combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stone_13251 {
    public static void main(String[] args) throws IOException {
        int M, K, T;
        int D[] = new int[51];
        double prob[] = new double[51];
        double ans = 0.0;
        T = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i< M; i++){
            D[i] = Integer.parseInt(st.nextToken());
            T += D[i];
        }
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        for(int i=0; i< M; i++){
            if(D[i] >= K){
                prob[i] = 1.0;
                for(int k=0; k<K; k++){
                    prob[i] *= (double) (D[i] - k) / (T - k);
                }
            }
            ans += prob[i];
        }
        System.out.println(ans);
    }
}
