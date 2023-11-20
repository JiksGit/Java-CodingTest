package SWEA_Test.D3;

import java.util.Scanner;

public class GuGuDan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 0;
            if(a < 10 && b < 10) result = a*b;
            else result = -1;
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
