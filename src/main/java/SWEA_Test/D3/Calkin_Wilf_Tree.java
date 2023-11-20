package SWEA_Test.D3;

import java.util.Scanner;

public class Calkin_Wilf_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int left = 1;
            int right = 1;
            String[] s=  sc.next().split("");
            for(String now : s){
                if(now.equals("L")){
                    right = left+ right;
                }
                else{
                    left = left+ right;
                }
            }

            System.out.printf("#%d %d %d\n", tc, left, right);
        }
    }
}
