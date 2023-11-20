package SWEA_Test.D2;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =1; i<= N; i++){
            int data = sc.nextInt();
            int result = 0;

            if(data % 2 == 0) {
                result = data / 2;
                result = 0 - result;
            } else {
                result = data / 2 + 1;
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
