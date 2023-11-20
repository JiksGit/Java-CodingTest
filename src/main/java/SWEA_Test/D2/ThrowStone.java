package SWEA_Test.D2;

import java.util.Scanner;

public class ThrowStone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<= T; tc++){
            int N = sc.nextInt();
            int min = 999999;
            int count = 0;
            for(int i=1; i<=N; i++){
                int data = sc.nextInt();
                if(data<0) data= -data;

                if(min == data) {
                    count++;
                }
                else if(min > data) {
                    min = data;
                    count = 1;
                }
            }
            System.out.printf("#%d %d %d\n", tc, min, count);
        }
    }
}
