package SWEA_Test.D3;

import java.util.Scanner;

public class Power_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc= 1; tc<=10; tc++) {
            sc.nextInt();
            int result = 0;
            int n = sc.nextInt();
            int s = sc.nextInt();
            result = function(n,s);

            System.out.printf("#%d %d\n", tc, result);
        }
    }
    private static int function(int n, int s){
        if(s == 1) return n;
        else return n * function(n, s-1);
    }
}
