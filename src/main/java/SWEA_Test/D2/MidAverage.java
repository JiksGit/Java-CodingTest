package SWEA_Test.D2;

import java.util.Scanner;

public class MidAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            int num, sum = 0;
            for(int i = 0; i < 10; i++) {
                num = sc.nextInt();

                sum += num;
                max = Math.max(max, num);
                min = Math.min(min, num);
            }

            sum = sum - max - min;
            int result = (int)Math.round(sum/8.0);

            System.out.println("#" + test_case + " " + result);
        }
    }
}
