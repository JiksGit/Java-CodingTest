package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Magnetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            int A[][] = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = 0; j < 100; j++) {
                int i = 0;
                boolean is1Found = false;

                while (i < 100) {
                    if (A[i][j] == 1) {
                        is1Found = true;
                    } else if (A[i][j] == 2 && is1Found) {
                        result++;
                        is1Found = false;
                    }
                    i++;
                }
            }

            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
