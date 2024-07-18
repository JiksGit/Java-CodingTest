package Programmers;

import java.util.*;
import java.util.HashSet;

public class 폰켓몬 {

    class Solution {
        public int solution(int[] nums) {

            HashSet<Integer> hashSet = new HashSet<>();

            for(int i =0; i<nums.length;i++) {
                hashSet.add(nums[i]);
            }

            if(hashSet.size()>nums.length/2)
                return nums.length/2;

            return hashSet.size();
        }
    }
}