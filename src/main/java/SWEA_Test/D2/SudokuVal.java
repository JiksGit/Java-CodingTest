package SWEA_Test.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SudokuVal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=T; tc++){
            int A[][] = new int[10][10];
            int result = 1;

            for(int i=1; i<=9; i++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                for(int j=1; j<=9; j++){
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            System.out.printf("#"+tc+" ");

            for(int i=1; i<=9; i++){
                boolean visited[] = new boolean[10];

                for(int j=1; j<=9; j++) {
                    if(visited[A[i][j]] == true) {
                        result = 0;
                        break;
                    }
                    else{
                        visited[A[i][j]] = true;
                    }
                }
            }
            for(int k=0; k<=2; k++) {
                for(int p=0; p<=2; p++) {
                    boolean visited[] = new boolean[10];

                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 3; j++) {
                            if (visited[A[3 * k + i][3 * p + j]] == true) {
                                result = 0;
                                break;
                            } else visited[A[3 * k + i][3 * p + j]] = true;
                        }
                    }

                }
            }
            for(int j=1; j<=9; j++){
                boolean visited[] = new boolean[10];

                for(int i=1; i<=9; i++) {
                    if(visited[A[i][j]] == true) {
                        result = 0;
                        break;
                    }
                    else{
                        visited[A[i][j]] = true;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
