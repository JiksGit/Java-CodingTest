package SWEA_Test.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SW10_pass1234 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc= 1; tc<=10; tc++) {
            String result = "";
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());

            String[] s = st.nextToken().split("");
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0; i<s.length; i++){
                list.add(i, Integer.valueOf(s[i]));
            }
            System.out.println(list.size());

            for(int i=0; i<list.size()-1;){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i);
                    list.remove(i);
                    i = 0;
                }
                else i++;
            }
            for(int i=0; i<list.size(); i++){
                result += list.get(i);
            }

            System.out.printf("#%d %s\n", tc, result);
        }
    }
}
