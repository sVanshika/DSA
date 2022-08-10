package dsa.arrays;

public class MinSwaps {
    public static int calMinSwaps(int[] nums, int k){
        int windowSize = 0; // window size = count of good elements in the entire array = elements <= k
        int n = nums.length;

        // calculating elements<=k
        for(int i=0; i<n; i++){
            if(nums[i] <= k) {
                System.out.println(nums[i]);
                windowSize++;
            }
        }
        System.out.println("window size = " + windowSize);

        // calculating num of bad elements in the first window
        int bad=0, min_swap;
        for(int i=0; i<windowSize; i++){
            if(nums[i] > k)
                bad++;
        }
        min_swap = bad;
        System.out.println("first bad = " + min_swap);

        // calculating in rest of the windows
        int i=0, j=i+windowSize-1;
        while(j < n){
            if(nums[i] <= k)
                bad--;
            else
                bad++;
            if(nums[j] <= k)
                bad--;
            else
                bad++;
            i++;
            j++;
            min_swap = Math.min(min_swap, bad);
        }

        return min_swap;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;
        System.out.println(calMinSwaps(nums, k));
    }
}
