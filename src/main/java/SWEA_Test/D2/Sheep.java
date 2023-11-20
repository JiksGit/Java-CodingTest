package SWEA_Test.D2;

import java.util.Scanner;

public class Sheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N;i++){
            int data = sc.nextInt();
            int result = 0;
            int sum =data;
            boolean a[] = new boolean[11];

            while(true){
                result++;
                String[] str = Integer.toString(sum).split("");
                for(int j=0; j<str.length; j++){
                    int n = Integer.parseInt(str[j]);
                    a[n] = true;
                }

                if(a[0]!=false&&a[1]!=false&&a[2]!=false&&a[3]!=false&&a[4]!=false&&a[5]!=false
                        &&a[6]!=false&&a[7]!=false&&a[8]!=false&&a[9]!=false) break;

                sum += data;
            }

            System.out.printf("#%d %d\n", i, data*result);
        }
    }
}
