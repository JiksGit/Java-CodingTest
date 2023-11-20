package SWEA_Test.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.sort;

public class SortArray {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc<= T; tc++){
            int N = Integer.parseInt(br.readLine());
            int A[] = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i< N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }
            sort(A);
            System.out.printf("#%d ", tc);
            for(int i=0; i< N; i++){
                System.out.print(A[i]+" ");
            }
            System.out.println();
        }
    }
}
