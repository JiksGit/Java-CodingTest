package SWEA_Test.D3;

import java.util.Scanner;

public class ExerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            int now = sc.nextInt();
            int result = 0;
            if (max < now) result = -1;
            else if(min > now) result = min - now;
            else result = 0;
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
