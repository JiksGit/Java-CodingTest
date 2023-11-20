package SWEA_Test.D2;

import java.util.Scanner;

public class WaterPrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            int P = sc.nextInt(); //A사 1L당 요금
            int Q = sc.nextInt(); //B사 R리터 이하 요금
            int R = sc.nextInt(); //B사 기준점
            int S = sc.nextInt(); //B사 이후 요금
            int W = sc.nextInt(); //한달 사용 수도양
            int result = 0;

            if(W <= R) result = Q;
            else result = Q + S*(W-R);

            result = Math.min(result, P*W);

            System.out.printf("#%d %d\n", i, result);
        }
    }
}
