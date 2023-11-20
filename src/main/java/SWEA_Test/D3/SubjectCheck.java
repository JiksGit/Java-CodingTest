package SWEA_Test.D3;

import java.util.Scanner;

public class SubjectCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            boolean A[] = new boolean[N + 1];
            for (int i = 1; i <= K; i++) {
                int s = sc.nextInt();
                A[s] = true;
            }
            System.out.printf("#%d ", tc);
            for (int j = 1; j <= N; j++) {
                if (!A[j]) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
