package SWEA_Test.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordPuzzle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T;tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int A[][] = new int[N+1][N+1];
            int result = 0;

            for(int i=1; i<= N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=1; j<= N; j++){
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=1; i<=N; i++){
                int data = 0;
                for(int j=1; j<=N; j++){
                    if(A[i][j] == 0) {
                        if(data == K) result++;
                        data = 0;
                    } else{
                        data++;
                    }
                }
                if(data == K) result++;
            }
            for(int j=1; j<=N; j++){
                int data = 0;
                for(int i=1; i<=N; i++){
                    if(A[i][j] == 0) {
                        if(data == K) result++;
                        data = 0;
                    } else{
                        data++;
                    }
                }
                if(data == K) result++;
            }
            System.out.printf("#%d %d\n", tc, result);
        }
    }
}
