package com.kaideas.udemy.complexityTheoryBasics;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {1, -6, 3, 8, 12, 34, 2, 4, 0, 33, 55 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < (nums.length - i); j++) {

                if (nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j - 1] = nums[j];
                     nums[j] = temp;
                }
            }
        }

        System.out.println("Voila, the BUBBLE sorted array:");
        for (int num : nums) System.out.print(num + " ");
    }
}
