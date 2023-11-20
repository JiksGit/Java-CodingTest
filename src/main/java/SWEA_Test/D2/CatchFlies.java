package SWEA_Test.D2;

import java.util.Scanner;

public class CatchFlies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num=sc.nextInt();
            int num2=sc.nextInt();
            int arr[][]=new int[num][num];
            int max=0;
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<num-num2+1;i++){
                for(int j=0;j<num-num2+1;j++){
                    int sum=0;
                    for(int k=0;k<num2;k++){
                        for(int l=0;l<num2;l++){
                            sum+=arr[i+k][j+l];
                        }
                    }
                    if(max<sum){
                        max=sum;
                    }
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}
