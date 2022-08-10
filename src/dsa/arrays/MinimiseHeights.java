package dsa.arrays;

import java.util.Arrays;

public class MinimiseHeights {
    public static int calMinHeight(int[] nums, int k){
        Arrays.sort(nums);
        int n = nums.length;
        int minEl=nums[0], maxEl=nums[n-1], minHeight = maxEl-minEl;

        for(int i=1; i<n; i++){
            minEl = Math.min(nums[0]+k, nums[i]-k);
            maxEl = Math.max(nums[n-1]-k, nums[i-1]+k);
            minHeight = Math.min(minHeight, maxEl-minEl);
        }
        return minHeight;
    }
    public static void main(String[] args) {
        int[] nums = {1,15,10,3, 9, 2, 8};
        // int k=6;

//        int minHeight = calMinHeight(nums, k);
//        System.out.println(minHeight);

        Arrays.sort(nums);
        for(int i: nums) System.out.print(i+" ");
        System.out.println();

        int found = Arrays.binarySearch(nums, 9);
        System.out.println("found = " + found);
    }
}
