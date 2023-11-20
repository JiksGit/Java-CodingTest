package SWEA_Test.D2;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc =1; tc<= T; tc++){
            System.out.printf("#%d\n", tc);
            int N = sc.nextInt();
            int A[][] = new int[N+1][N+1];
            for(int i=1; i<= N; i++){
                A[i][1] = 1;
                A[i][i] = 1;
            }
            for(int i=3; i<=N; i++){
                for(int j=2; j<= i-1; j++){
                    A[i][j] = A[i-1][j-1] + A[i-1][j];
                }
            }
            for(int i=1; i<=N; i++){
                for(int j=1;j<=N; j++){
                    if(A[i][j] == 0) continue;
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
