package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW3_String1213 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for(int tc= 1; tc<=10; tc++) {
            int result = 0;
            sc.next();
            String s = sc.next();
            String b = sc.next();
            for(int i =0; i<= b.length()- s.length(); i++){
                String c = b.substring(i, i + s.length());
                if(c.equals(s)) result++;
            }

            System.out.printf("#%d %d\n", tc,result);
        }
    }
}
