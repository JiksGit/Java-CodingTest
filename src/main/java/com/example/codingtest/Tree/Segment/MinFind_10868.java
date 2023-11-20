package com.example.codingtest.Tree.Segment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinFind_10868 {
    static long tree[];

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int treeHeight = 0;
        int tNode = N;
        while(tNode > 0){
            tNode /= 2;
            treeHeight++;
        }
        int treeSize = (int) Math.pow(2, treeHeight + 1);
        tree = new long[treeSize + 1];
        int leftNodeStart = treeSize/2;
        for(int i = 0; i<tree.length; i++){
            tree[i] = Integer.MAX_VALUE;
        }

        for(int i = leftNodeStart; i< leftNodeStart + N; i++){
            tree[i] = Long.parseLong(br.readLine());
        }
        setTree(treeSize - 1);

        for(int i= 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            s = leftNodeStart + s - 1;
            e = leftNodeStart + e - 1;
            System.out.println(getMin(s, e));
        }
        br.close();
    }

    private static void setTree(int i){
        while(i > 1){
            if(tree[i/2] > tree[i]){
                tree[i/2] = tree[i];
            }
            i--;
        }
    }
    private static long getMin(int s, int e){
        long Min = Long.MAX_VALUE;
        while(s <= e){
            if(s % 2 == 1){
                Min = Math.min(Min, tree[s]);
                s++;
            }
            if(e % 2 == 0){
                Min = Math.min(Min, tree[e]);
                e--;
            }
            s /= 2;
            e /= 2;
        }
        return Min;
    }
}
