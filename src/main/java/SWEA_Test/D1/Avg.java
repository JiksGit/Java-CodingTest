package SWEA_Test.D1;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc=1; tc<=t; tc++) {
            double result = 0.0;
            for (int i=0; i<10; i++) {
                int data = sc.nextInt();
                result += data;
            }
            result /= 10.0;
            System.out.printf("#%d %d\n", tc, Math.round(result));
        }
    }
}
