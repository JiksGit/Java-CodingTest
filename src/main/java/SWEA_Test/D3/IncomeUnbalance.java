package SWEA_Test.D3;

import java.util.Scanner;

public class IncomeUnbalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int N = sc.nextInt();
            int A[] = new int[N+1];
            int sum= 0;
            for(int i=1; i<=N; i++){
                A[i] = sc.nextInt();
                sum+= A[i];
            }
            int result = 0;
            int avg = sum / N;
            for(int i=1; i<=N; i++){
                if(A[i] <= avg) result++;
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
