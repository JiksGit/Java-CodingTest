package SWEA_Test.D2;

import java.util.Scanner;

public class EasyUnzip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++){
            System.out.printf("#%d\n", tc);

            int N = sc.nextInt();
            int count = 10;

            for(int i= 1; i<= N;i++){
                String s = sc.next();
                int c = sc.nextInt();
                for(int j=1; j<= c; j++){
                    System.out.printf("%s",s);
                    count--;
                    if(count == 0){
                        System.out.println();
                        count = 10;
                    }
                }
            }
            System.out.println();
        }
    }
}
