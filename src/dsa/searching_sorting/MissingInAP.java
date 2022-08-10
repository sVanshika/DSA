package dsa.searching_sorting;

public class MissingInAP {

    public static int findMissing(int[] nums) {
        int n = nums.length;
        System.out.println("n - " + n);
        int sumArray=0;

        for(int i=0; i<n; i++)
            sumArray += nums[i];

        double temp = Math.ceil((n+1)/2);
        System.out.println("temp = " + temp);  


        int sumSeries = (int)Math.ceil((n+1)/2) * (nums[0] + nums[n-1]);

        System.out.println((int)Math.ceil((n+1)/2)  + "   " + (nums[0] + nums[n-1]));
        System.out.println("series = " + sumSeries + "\tarray = " + sumArray);
        
        return (sumSeries - sumArray);
    }


    public static void main(String[] args) {
        int[] nums = {2,4,8,10,12,14};
        int missingNumber = findMissing(nums);

        System.out.println(missingNumber);
    }
    
}
