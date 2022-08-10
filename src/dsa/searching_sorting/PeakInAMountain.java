package dsa.searching_sorting;

public class PeakInAMountain {

    public static int peakIndexInMountainArray(int[] arr) {
        int ans = -1;
        int n = arr.length;
        for(int i=0; i<(n-2); i++){
            if(arr[i+1] > arr[i] && arr[i+2] < arr[i+1]){
                ans = i+1;
                break;
            }
        }
        
        return ans;        
    }

    public static int peakIndexInMountainArrayOptimal(int[] arr) {
        int low=0, high=arr.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            System.out.println("low="+low+"\thigh="+high+"\tmid="+mid);
            
            if(arr[mid] < arr[mid+1]) //1st line
                low = mid+1;
            else
                high = mid-1;
        }

        return low;
    }
    
    public static void main(String[] args) {
        int[] arr = {0,10,5,2,1};
        int peak = peakIndexInMountainArrayOptimal(arr);
        System.out.println(peak);
    }
}
