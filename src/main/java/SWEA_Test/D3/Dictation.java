package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dictation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int t = 1; t <= test; t++) {
            int n = sc.nextInt();
            String s = sc.next();
            String cmp = sc.next();
            int cnt = 0;

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == cmp.charAt(i))
                    cnt++;
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
