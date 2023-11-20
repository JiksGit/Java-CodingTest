package SWEA_Test.D1;

import java.util.Scanner;

public class PlusOdds {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc=1; tc<=t; tc++) {
            int result = 0;
            for (int i=0; i<10; i++) {
                int data = sc.nextInt();
                if (data % 2 == 1) {
                    result += data;
                }
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
