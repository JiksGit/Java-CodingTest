package SWEA_Test.D2;

import java.util.Scanner;

public class Mode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int u = sc.nextInt();
            System.out.printf("#%d ", u);
            int[] G = new int[101];
            int max = 0;

            for(int i =1; i<= 1000; i++){
                int score = sc.nextInt();
                G[score]++;
                if(max < G[score]) max = G[score];
            }
            for(int i=100; i>= 0; i--){
                if(G[i] == max) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
