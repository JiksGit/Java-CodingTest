package SWEA_Test.D3;

import java.util.Scanner;

public class MemoryRecovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            String[] s = sc.next().split("");
            String now = "0";
            int result = 0;
            for(int i =0; i<s.length; i++){
                if(!s[i].equals(now)){
                    result++;
                    now = s[i];
                }
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
