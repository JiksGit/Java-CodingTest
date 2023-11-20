package SWEA_Test.D2;

import java.util.Scanner;

public class TwoStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int tc= 1; tc<= N; tc++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int I[] = new int[i+1];
            int J[] = new int[j+1];
            int result = 0;

            for(int p =1; p<= i; p++){
                I[p] = sc.nextInt();
            }
            for(int k =1; k<= j; k++){
                J[k] = sc.nextInt();
            }
            if(i<j){
                for(int k=1; k<= j-i+1; k++) {
                    int data = 0;
                    for (int p = 1; p <= i; p++) {
                        data += I[p]*J[k+p-1];
                    }
                    result = Math.max(data, result);
                }
                System.out.printf("#%d %d\n", tc, result);
            }
            else{
                for(int k=1; k<= i-j+1; k++) {
                    int data = 0;
                    for (int p = 1; p <= j; p++) {
                        data += J[p]*I[k+p-1];
                    }
                    result = Math.max(data, result);
                }
                System.out.printf("#%d %d\n", tc, result);
            }
        }
    }
}
