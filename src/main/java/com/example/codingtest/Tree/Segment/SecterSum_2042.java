package com.example.codingtest.Tree.Segment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecterSum_2042 {
    static long[] tree;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int treeHeight = 0;
        int length = N;
        while(length != 0) {
            length /= 2;
            treeHeight++;
        }
        int treeSize = (int) Math.pow(2, treeHeight + 1); // 16
        int leftNodeStartIndex = treeSize / 2;
        tree = new long[treeSize + 1];

        for (int i = leftNodeStartIndex; i< leftNodeStartIndex + N; i++){  //8부터 N개
            tree[i] = Long.parseLong(br.readLine());  //리프노드 초기 선언
        }

        setTree(treeSize - 1); //트리 초기 세팅

        for(int i = 0; i < M+K; i++){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long s = Long.parseLong(st.nextToken());
            long e = Long.parseLong(st.nextToken());

            if (a==1){
                changeVal((int) (leftNodeStartIndex + s - 1), e);
            } else if(a==2){
                s = leftNodeStartIndex + s - 1;
                e = leftNodeStartIndex + e - 1;
                System.out.println(getSum((int) s, (int)e));
            } else {
                return;
            }
        }
        br.close();
    }

    private static long getSum(int s, int e) {
        long partSum = 0;
        while(s <= e){
            if (s % 2 == 1){
                partSum = partSum + tree[s];
                s++;
            }
            if (e % 2 == 0){
                partSum = partSum + tree[e];
                e--;
            }
            s = s/2;
            e = e/2;
        }
        return partSum;
    }

    private static void changeVal(int index, long val) {
        long diff = val - tree[index];
        while(index > 0){
            tree[index] = tree[index] + diff;
            index = index / 2;
        }
    }

    private static void setTree(int i) {
        while (i != 1){
            tree[i/2] += tree[i];
            i--;
        }
    }
}
