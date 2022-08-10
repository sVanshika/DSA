package dsa.arrays;

public class RotateArray {
    // Time=O(n*k) ; Space=O(1)
    public static void rotate(int[] nums, int k){
        int n=nums.length;
        k = k%n;
        while(k-- > 0) {
            int last = nums[n-1];
            for (int i = n - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = last;
        }
    }

    // Time: O(n) Space: O(n)
    public static void rotate2(int[] nums,  int k){
        int n = nums.length;
        k = k%n;
        if(k == n || n < 2)
            return;
        int index=0;
        int[] ans = new int[n];
        for(int i=n-k; i<n; i++, index++){
            ans[index] = nums[i];
        }

        for(int i=0; i<n-k; i++, index++){
            ans[index] = nums[i];
        }

        System.arraycopy(ans, 0, nums, 0, n);
    }

    // Time: O(n) Space: O(n)
    public static void reverse(int[] nums, int start, int end){
        int i=start, j=end;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void rotate3(int[] nums, int k){
        int n = nums.length;
        if(k == n || n < 2)
            return;
        k = k%n;
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=22;

        rotate2(nums, k);

        for(int i: nums)
            System.out.print(i + " ");
        System.out.println();
    }
}
