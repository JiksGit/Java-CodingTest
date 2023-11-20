package SWEA_Test.D3;

import java.util.Scanner;

public class Coding_Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int K = sc.nextInt();

            int s = (int) Math.pow(2, K);
            int result = 0;
            int A[][] = new int[s+1][K+2];
            for(int p=1; p<= s; p++){
                A[p][1] = sc.nextInt();
            }
            for(int j=1; j<=K; j++){
                for(int i =1; i<=s/2; i++){
                    int left = 2*i -1;
                    int right = 2*i;
                    if(A[left][j] > A[right][j]){
                        result += (A[left][j] - A[right][j]);
                        A[i][j+1] = A[left][j];
                    }
                    else if(A[left][j] < A[right][j]){
                        result += (A[right][j] - A[left][j]);
                        A[i][j+1] = A[right][j];
                    }
                    else{
                        A[i][j+1] = A[left][j];
                    }
                }
                s= s/2;
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
