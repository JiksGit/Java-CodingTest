package SWEA_Test.D2;

import java.util.Scanner;

public class EasyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<= T; tc++){
            int N = sc.nextInt();
            System.out.printf("#%d\n", tc);

            int a = 0, b = 0, c = 0, d= 0, e= 0, f= 0,g= 0, h= 0;

            a = N / 50000;
            N = N % 50000;
            b = N / 10000;
            N = N % 10000;
            c = N / 5000;
            N = N % 5000;
            d = N / 1000;
            N = N % 1000;
            e = N / 500;
            N = N % 500;
            f = N / 100;
            N = N % 100;
            g = N / 50;
            N = N % 50;
            h = N / 10;

            System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
        }
    }
}
