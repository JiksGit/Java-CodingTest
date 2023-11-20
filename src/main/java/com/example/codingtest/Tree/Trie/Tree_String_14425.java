//package com.example.codingtest.Tree.Trie;
//
//import java.util.Scanner;
//
//public class Tree_String_14425 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        tNode root = new tNode();
//        while (n > 0){
//            String text = sc.next();
//            tNode now = root;
//            for (int i = 0; i < text.length(); i++){
//                char c= text.charAt(i);
//
//                if(now.next[c-'a'] == null){
//                    now.next[c-'a'] = new tNode();
//                }
//                now = now.next[c-'a'];
//                if (i == text.length() -1)
//                    now.isEnd = true;
//            }
//            n--;
//        }
//    }
//}
//class tNode{
//    tNode[] next = new tNode[26];
//    boolean isEnd;
//}
