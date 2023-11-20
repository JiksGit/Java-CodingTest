package SWEA_Test.D3;

import java.util.Scanner;

public class Card_7102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N+M+1];
            int max = 0;

            for(int i=1; i<=N; i++){
                for(int j=1; j<= M; j++){
                    A[i+j]++;
                    max = Math.max(max, A[i+j]);
                }
            }
            System.out.printf("#%d ", tc);
            for(int i=1; i<=N+M; i++){
                if(A[i] == max) System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
