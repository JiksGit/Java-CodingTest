package SWEA_Test.D3;

import java.util.Scanner;

public class FourtyAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int sum = 0;
            int avg = 0;
            for(int i=1; i<= 5; i++){
                int score = sc.nextInt();
                if(score < 40) score = 40;
                sum += score;
            }
            avg = sum/ 5;

            System.out.printf("#%d %d\n", tc, avg);
        }

    }
}
