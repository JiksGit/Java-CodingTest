package SWEA_Test.D2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i= 1; i<= N; i++){
            String s = sc.next();
            for(int j =1; j<= s.length(); j++){
                String s1 = s.substring(0,j);
                String s2 = s.substring(j,j+j);
                if(s1.equals(s2)){
                    System.out.printf("#%d %d\n", i, j);
                    break;
                }
            }
        }
    }
}
