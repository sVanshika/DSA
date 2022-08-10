package dsa.searching_sorting;

import java.util.*;

public class MajorityElement {

    public static int majorityElementBrute(int[] nums) {
        int n = nums.length;
        int ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
            if(entry.getValue() > Math.floor(n/2))
                ans = entry.getKey();
        }
        
        return ans;
    }

    public static int majorityElementOptimal(int[] nums) {
        int votes=0, majorityElement = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(votes == 0){
                majorityElement = nums[i];
                votes = 1;
            }
            if(nums[i] == majorityElement)
                votes++;
            else
                votes--;
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,2};
        System.out.println("Majority Element = " + majorityElementOptimal(nums));
    }
    
}
