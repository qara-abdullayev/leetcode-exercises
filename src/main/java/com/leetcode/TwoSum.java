package com.leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

        System.out.println(twoSum1(nums, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static int twoSum1(int[] nums, int target) {
        int i=0;
        int j=i+1;
        return Arrays.stream(nums).filter(sum-> nums[i]+nums[j]==target).sum();
    }
}
