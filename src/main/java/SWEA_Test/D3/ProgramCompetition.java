package SWEA_Test.D3;

import java.util.Scanner;

public class ProgramCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int N= sc.nextInt();
            int M= sc.nextInt();
            int[][] A = new int[N+1][M+1];
            int max = 0;
            int result = 0;

            for(int i=1 ; i<=N; i++) {
                int sum = 0;

                for (int j = 1; j <= M; j++) {
                    sum += sc.nextInt();
                }
                A[i][M - 1] = sum;
                max = Math.max(max, sum);
            }

            for(int i=1; i<= N; i++){
                if(A[i][M-1] == max) result++;
            }

            System.out.printf("#%d %d %d\n", tc, result, max);
        }
    }
}
