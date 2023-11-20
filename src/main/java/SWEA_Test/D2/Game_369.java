package SWEA_Test.D2;

import java.util.Scanner;

public class Game_369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<= T; i++){
            String s = Integer.toString(i);
            String[] str = s.split("");
            int count = 0;

            for(int j=0; j<s.length(); j++){
                if(str[j].equals("3") || str[j].equals("6") || str[j].equals("9")){
                    count++;
                }
            }

            if(count == 2) System.out.print("-- ");
            else if (count == 1) System.out.print("- ");
            else System.out.print(i+" ");
        }
    }
}


