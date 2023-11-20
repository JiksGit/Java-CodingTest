package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Summation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc= 1; tc<=T; tc++) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            int Max = 0;
            int Min = 1000001;
            while(st.hasMoreTokens()){
                int price = 0;
                String[] str = st.nextToken().split("");
                for(int i =0; i< str.length; i++){
                    price += Integer.parseInt(str[i]);
                }
                Max = Math.max(Max, price);
                Min = Math.min(Min, price);
            }

            System.out.printf("#%d %d %d\n", tc, Max, Min);
        }
    }
}
