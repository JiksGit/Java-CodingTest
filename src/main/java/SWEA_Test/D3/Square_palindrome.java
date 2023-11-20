package SWEA_Test.D3;

import java.util.Scanner;

public class Square_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int result = 0;
            int start = sc.nextInt();
            int finish = sc.nextInt();
            for(int i = start; i<= finish; i++){
                if(palin(i)) result++;
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }

    public static boolean palin(int v){
        String str = String.valueOf(v);
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }

        double sqrtV = Math.sqrt(v);
        if(sqrtV != Math.floor(sqrtV)) return false;
        str = String.valueOf((int)sqrtV);
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
}
