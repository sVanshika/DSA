package dsa.searching_sorting;

import java.util.Arrays;

public class MissingAndRepeating {

    // T =  O(n^2) S = O(1)
    public static int[] findMissingAndRepeatingBrute(int[] nums){
        int n = nums.length;
        int missing=-1, repeating=-1;
        
        for(int i=0; i<n; i++){
            
            boolean numFound = false;

            for(int j=0; j<n; j++){
                if(nums[i] == nums[j] && i != j)
                    repeating = nums[i];
                if(i+1 == nums[j])
                    numFound = true;
            }
            if(!numFound)
                missing = i+1;
        }

        int[] ans = {missing, repeating};
        return ans;
    }

    // Optimal: T=O(n logn) S=O(1)
    public static int[] findMissingAndRepeatingOptimal(int[] nums) {
        // sort
        // linear traverse to find sum of array and repeating number
        // missing number = sum(n) - sum(array) + repeating

        Arrays.sort(nums);

        int n = nums.length;
        int repeating = -1, missing = -1;
        int arraySum = nums[0];
        
        for(int i=1; i<n; i++){
            arraySum += nums[i];
            if(nums[i-1] == nums[i])
                repeating = nums[i];
        }

        int sumTillN = n*(n+1)/2;

        missing = sumTillN - arraySum + repeating;

        int[] ans = {missing, repeating};

        return ans;        
    }

    public static int[] findMissingAndRepeatingOptimal_2(int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];

        for(int i=0; i<n; i++){
            count[nums[i]] +=1 ;
        }

        int missing = -1, repeating = -1;
        for(int i=0; i<=n; i++){
            if(count[i] == 0)
                missing = i;
            else if(count[i] == 2)
                repeating = i;
        }

        int[] ans = {missing, repeating};

        return ans;           
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        
        int[] ans = findMissingAndRepeatingOptimal_2(nums);

        System.out.println("missing = " + ans[0]);
        System.out.println("repeating = " + ans[1]);
    }
    
}
