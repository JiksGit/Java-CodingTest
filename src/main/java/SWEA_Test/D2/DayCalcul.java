package SWEA_Test.D2;

import java.util.Scanner;

public class DayCalcul {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i =1; i<= N; i++){
            int M1 = sc.nextInt();
            int D1 = sc.nextInt();
            int M2 = sc.nextInt();
            int D2 = sc.nextInt();
            int result = 0;

            if(M1 == M2) {
                result = D2 - D1 + 1;
                System.out.printf("#%d %d\n", i, result);
            }
            else{
                result += A[M1]-D1+1+D2;
                for(int k=M1+1; k< M2; k++) result += A[k];
                System.out.printf("#%d %d\n", i, result);
            }
        }
    }
}
