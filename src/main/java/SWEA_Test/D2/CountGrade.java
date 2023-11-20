package SWEA_Test.D2;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class CountGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] G = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

        int T = sc.nextInt();
        for(int tc= 1; tc<= T; tc++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            double data = 0;
            PriorityQueue<Double> queue = new PriorityQueue<>(new Comparator<Double>() {
                @Override
                public int compare(Double o1, Double o2) {
                    return Double.compare(o2, o1);
                }
            });
            int t = N / 10;

            for(int p = 1; p<= N; p++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                double sum = a * 0.35 + b * 0.45 + c * 0.2;

                queue.add(sum);
                if(p == K) data = sum;
            }
            for(int i =1 ; i<= N; i++){
                if(data == queue.poll()) {
                    String s = G[(i-1)/t];
                    System.out.printf("#%d %s\n", tc, s);
                }
            }
        }
    }
}
