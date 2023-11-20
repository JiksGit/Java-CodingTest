package SWEA_Test.D3;

import java.util.Scanner;

public class Diversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int result = 0;
            boolean A[] = new boolean[10];
            String num = sc.next();
            String[] str = num.split("");
            for(int i=0; i<str.length; i++){
                if(!A[Integer.parseInt(str[i])]) {
                    result++;
                    A[Integer.parseInt(str[i])] = true;
                }
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
