package SWEA_Test.D3;

import java.util.Scanner;

public class NotVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            String[] s = sc.next().split("");
            System.out.printf("#%d ", tc);

            for(int i=0; i< s.length; i++){
                if(s[i].equals("a") || s[i].equals("e") || s[i].equals("i") || s[i].equals("u") || s[i].equals("o") ) {
                    continue;
                }
                System.out.printf("%s", s[i]);
            }
            System.out.println();
        }
    }
}
