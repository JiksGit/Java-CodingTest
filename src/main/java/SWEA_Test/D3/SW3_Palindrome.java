package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW3_Palindrome {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);

        for(int tc= 1; tc<=10; tc++) {
            int result = 0;
            int T = sc.nextInt();
            char[][] A = new char[10][10];
            for(int i=1; i<= 8 ;i++){
                String s = sc.next();
                for(int j=1; j<=8;j++) {
                    A[i][j] = s.charAt(j-1);
                }
            }

            for(int i=1; i<=8-T+1; i++){
                for(int j=1; j<= 8; j++){
                    int temp = 0;
                    for(int p=0; p< T /2; p++){
                        if(A[j][i+p] != (A[j][i+T-p-1])) temp =-1;
                    }
                    if(temp == 0) result ++;
                }
            }
            for(int i=1; i<=8-T+1; i++){
                for(int j=1; j<=8; j++){
                    int temp = 0;
                    for(int p=0; p<T/2; p++){
                        if(A[i+p][j] !=(A[i+T-p-1][j])) temp =-1;
                    }
                    if(temp == 0) result ++;
                }
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}