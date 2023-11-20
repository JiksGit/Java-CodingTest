package SWEA_Test.D2;

import java.io.*;
import java.util.StringTokenizer;

public class NumberArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<=T; tc++){
            int N = Integer.parseInt(br.readLine());
            int A[][] = new int[N+1][N+1];
            int B[][] = new int[N+1][N+1];
            int C[][] = new int[N+1][N+1];
            int D[][] = new int[N+1][N+1];
            for(int i=1; i<=N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=1;j<=N; j++){
                    A[i][j]=Integer.parseInt(st.nextToken());
                }
            }

            for(int i=1; i<=N; i++){
                for(int j=N; j>=1; j--){
                    B[i][N-j+1] = A[j][i];
                }
            }
            for(int i=N; i>=1; i--){
                for(int j=N; j>=1; j--){
                    C[N-i+1][N-j+1] = A[i][j];
                }
            }
            for(int j=N; j>=1; j--){
                for(int i=1; i<=N; i++){
                    D[N-j+1][i] = A[i][j];
                }
            }
            System.out.printf("#%d\n",tc);
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++) System.out.print(B[i][j]);
                System.out.print(" ");
                for(int j=1; j<=N; j++) System.out.print(C[i][j]);
                System.out.print(" ");
                for(int j=1; j<=N; j++) System.out.print(D[i][j]);
                System.out.println();
            }
        }
    }
}
