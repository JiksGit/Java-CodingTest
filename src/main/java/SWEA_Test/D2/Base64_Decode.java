package SWEA_Test.D2;

import java.io.*;
import java.util.Base64;

public class Base64_Decode {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int testCase=1; testCase<=T; testCase++) {
            String str = br.readLine();
            String result = new String(Base64.getDecoder().decode(str));
            System.out.println("#" + testCase + " " + result);
        }
    }
}