package SWEA_Test.D2;

import java.util.Scanner;

public class SightAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            System.out.printf("#%d ",tc);
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            int hsum = h1+h2;
            int msum = m1+m2;
            if(m1+m2 >= 60) {
                hsum++;
                msum = msum - 60;
            }
            if(hsum > 12) hsum= hsum- 12;
            System.out.printf("%d %d\n", hsum, msum);
        }
    }
}

