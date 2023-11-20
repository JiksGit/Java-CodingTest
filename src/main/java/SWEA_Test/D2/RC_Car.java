package SWEA_Test.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RC_Car {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++) {
            int time = Integer.parseInt(br.readLine()); //시간
            int rc = 0; //속도
            int dis = 0; //거리

            for(int i=0; i<time; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int command = Integer.parseInt(st.nextToken());

                if(command != 0) {
                    int accel = Integer.parseInt(st.nextToken()); //가속도

                    if(command == 1) { //가속
                        rc += accel;
                    } else { //감속
                        if(rc < accel) {
                            rc = 0;
                        } else {
                            rc -= accel;
                        }
                    }

                }

                dis += rc;
            }
            System.out.println("#"+tc+" "+dis);
        }
    }
}
