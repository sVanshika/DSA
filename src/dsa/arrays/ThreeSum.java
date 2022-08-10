package dsa.arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        int n = nums.length;
        Set<List<Integer>> res  = new HashSet<>();
        for(int i=0; i<n; i++){
            int target = -nums[i];
            List<Integer> diffArr = new ArrayList<>();
            // 2 pair sum approach
            for(int j=0; j<nums.length; j++){
                List<Integer> triplets = new ArrayList<>();
                if(i != j){
                    int index = diffArr.indexOf(nums[j]);
                    if(index != -1){
                        // System.out.println(nums[i] + " " + nums[j] + " " + -(nums[i]+nums[j]));
                        res.add(Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j])));
                        System.out.println("added = " + Arrays.asList(nums[i], nums[j], -(nums[i]+nums[j])));
                    }
                    else
                        diffArr.add(target - nums[j]);
                }
            }

//            if(!tripletSet.contains(triplets))
//                tripletSet.add(triplets);
        }

        System.out.println("Set = " + res);
    }
}
