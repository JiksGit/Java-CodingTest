package SWEA_Test.D3;

import java.util.Scanner;

public class FastSunDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String S[] = {"SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};
        for(int tc= 1; tc<=T; tc++) {
            System.out.printf("#%d ", tc);
            String s = sc.next();
            for(int i=1; i<= 7; i++){
                if(S[i-1].equals(s)) System.out.println(i);
            }
        }
    }
}
