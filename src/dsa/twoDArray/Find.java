package dsa.twoDArray;

public class Find{

    public static int binarySearch(int[] arr, int target, int low, int high) {
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                high = mid-1;
            else 
                low = mid+1;
        }
        return -1;
        
    }
    
    public static boolean findElement(int[][] arr, int target) {
        int row=arr.length, col=arr[0].length;
        int low=0, high=row-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            // target lies in the mid row
            if(arr[mid][0] < target && target < arr[mid][col-1]){
                int foundAtIndex = binarySearch(arr[mid], target, 0, col-1);
                if(foundAtIndex != -1){
                    System.out.println("present at " + (mid) + "," + foundAtIndex);
                    return true;
                }
                else
                    return false;
            }

            // target lies in upper rows
            if(target < arr[mid][0])
                high = mid-1;
            
            // target lies in lower rows
            if(arr[mid][col-1] < target)
                low = mid+1;

        }

        return false;    
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int target = 5;
        boolean found = findElement(arr, target);
        System.out.println(found);
        
    }
}