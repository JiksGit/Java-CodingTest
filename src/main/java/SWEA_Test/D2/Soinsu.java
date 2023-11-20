package SWEA_Test.D2;

import java.util.Scanner;

public class Soinsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = {2, 3, 5, 7, 11};

        for(int i=1; i<= N; i++){
            int data = sc.nextInt();
            int count[] = {0, 0, 0, 0, 0};

            for(int j=0; j<= 4; j++){
                while(data % arr[j] == 0){
                    data /= arr[j];
                    count[j]++;
                }
            }
            System.out.printf("#%d %d %d %d %d %d\n", i, count[0], count[1], count[2], count[3], count[4]);
        }
    }
}
