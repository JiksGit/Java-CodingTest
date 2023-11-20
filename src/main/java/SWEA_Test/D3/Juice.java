package SWEA_Test.D3;

import java.util.Scanner;

public class Juice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int N = sc.nextInt();
            System.out.printf("#%d ", tc);
            for(int i =1; i<= N;i++){
                System.out.printf("1/%d ",N);
            }
            System.out.println();
        }
    }
}
