package SWEA_Test.D2;

import java.util.Scanner;

public class SnailNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<= T; tc++){
            int N = sc.nextInt();
            int now = 1;
            int A[][] = new int[N+1][N+1];
            int i= 1;
            int j= 0;
            int k= 0;
            while(now <= N*N) {
                while(j< N-k){
                    j++;
                    A[i][j] = now++;
                }
                while(i< N-k){
                    i++;
                    A[i][j] = now++;
                }
                while(j> 1+k){
                    j--;
                    A[i][j] = now++;
                }
                k++;
                while(i> 1+k){
                    i--;
                    A[i][j] = now++;
                }
            }
            System.out.printf("#%d\n",tc);
            for(int p =1; p<=N; p++){
                for(int o=1; o<=N; o++){
                    System.out.print(A[p][o]+" ");
                }
                System.out.println();
            }
        }
    }
}