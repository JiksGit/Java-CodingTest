package SWEA_Test.D3;

import java.util.Scanner;

public class RaceDifficulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc= 1; tc<=T; tc++) {
            int N = sc.nextInt();
            int up = 0, down=0;
            int before = sc.nextInt();
            for(int i=1; i< N; i++){
                int now= sc.nextInt();
                if(before < now) up = Math.max(up, now-before);
                else if(before > now) down = Math.max(down, before - now);
                before = now;
            }
            System.out.printf("#%d %d %d\n", tc, up, down);
        }
    }
}
