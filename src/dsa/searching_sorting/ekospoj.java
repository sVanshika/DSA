package dsa.searching_sorting;

public class ekospoj{

    public static int getWoodCut(int[] arr, int sawHeight) {
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            int diff = arr[i] - sawHeight;
            if(diff > 0)
                sum += diff;
        }

        return sum;        
    }

    public static int getMaxHeightOfSaw(int[] arr, int n, int target){
        int maxHeightOfSaw = -1;

        // find max height in the array
        int maxHeight = arr[0];
        for(int i=1; i<n; i++){
            maxHeight = Math.max(maxHeight, arr[i]);
        }
        System.out.println("max height = " + maxHeight);

        int low=0, high=maxHeight;
        while(low <= high){
            int mid = low + (high-low)/2;
            int woodCut = getWoodCut(arr, mid);

            System.out.println("low = " + low + "\thigh = " + high + "\tmid = " + mid + "\twoodCut = " + woodCut);
            
            if(woodCut >= target){
                maxHeightOfSaw = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }

        return maxHeightOfSaw;
    }

    public static void main(String[] args) {
        int[] arr = {15, 8, 18, 6};
        int n = arr.length;
        int m = 30;

        System.out.println(getMaxHeightOfSaw(arr, n, m));

    }
}