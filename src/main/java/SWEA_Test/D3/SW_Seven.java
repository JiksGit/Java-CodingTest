package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW_Seven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc= 1; tc<=10; tc++) {
            int test = Integer.parseInt(br.readLine());
            System.out.printf("#%d ", tc);

            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer st= new StringTokenizer(br.readLine());

            int A[] = new int[8];
            for(int i =0; i< 8; i++){
                queue.add(Integer.parseInt(st.nextToken()));
            }

            int index = 1;

            while(true){
                int cur = queue.poll() - index;
                if(cur <=0 ){
                    queue.add(0);
                    break;
                }
                else{
                    queue.add(cur);
                }
                index = (index % 5) + 1;
            }

            for(int p= 0; p<8; p++){
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }
    }
}
