package dsa.searching_sorting;

public class FirstLastPos {

    public static int firstPos(int[] arr, int target) {
        int low=0, high=arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1; // check in left part as well
            }
            else if(arr[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }

    public static int lastPos(int[] arr, int target) {
        int low=0, high=arr.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                low = mid+1; // check in right part as well
            }
            else if(arr[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,5,5,5,7,8,9,9};
        int target = 5;
        int firstPos = firstPos(arr, target);
        int lastPos = lastPos(arr, target);
        System.out.println("First pos = " + firstPos);
        System.out.println("Last pos = " + lastPos);

        int totalOccurences = lastPos - firstPos + 1;
        System.out.println("Total occurences = " + totalOccurences);
    }
    
}
