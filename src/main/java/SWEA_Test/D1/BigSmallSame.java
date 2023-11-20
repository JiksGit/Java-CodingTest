package SWEA_Test.D1;

import java.util.Scanner;

public class BigSmallSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int data1 = sc.nextInt();
            int data2 = sc.nextInt();
            char c;
            if(data1 > data2) System.out.printf("#%d >\n", i);
            else if(data1 < data2) System.out.printf("#%d <\n", i);
            else System.out.printf("#%d =\n", i);
        }
    }
}
