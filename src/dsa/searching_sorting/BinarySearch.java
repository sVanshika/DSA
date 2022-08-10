package dsa.searching_sorting;

public class BinarySearch {
    public static int fixedPoint(int[] arr){

        int low = 0, high = arr.length-1;

        while(low<= high){
            int mid = (low+high)/2;
            if(mid == arr[mid])
                return mid;
            else if(arr[mid] < mid)
                low = mid+1;
            else
                high = mid-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 7};
        System.out.println(fixedPoint(arr));
    }
}
