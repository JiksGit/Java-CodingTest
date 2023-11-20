package SWEA_Test.D3;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        long N, move, i;
        for (int testcase = 1; testcase <= TC; testcase++) {
            N = sc.nextLong();
            move = N - 1;
            for(i=2; i <= Math.sqrt(N); i++) {
                if (N%i == 0 && move > i+N/i-2) {
                    move = i+N/i-2;
                }
            }
            System.out.printf("#%d %d\n", testcase, move);
        }
    }
}
