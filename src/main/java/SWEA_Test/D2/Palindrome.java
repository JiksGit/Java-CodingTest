package SWEA_Test.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i= 1; i<= N; i++){
            int result = 1;
            String s = br.readLine();
            String[] str = s.split("");
            for(int j=0; j<str.length; j++){
                if(!str[j].equals(str[str.length-j-1])) {
                    result = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}
