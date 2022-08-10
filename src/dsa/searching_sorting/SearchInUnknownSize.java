package dsa.searching_sorting;

import java.util.Arrays;

/**
 * search in sorted array of unknown size
 * test cases will be like whatever the code is it will give TLE
 * approach: 1. find range 2. binary search on this range
 */
public class SearchInUnknownSize {

    public static int[] getRange(int[] arr, int target) {
        int start=0, end=1, value=arr[0];
        
        while(value < target){
            start = end;
            end = end*2;
            value = arr[end];
        }

        int[] ans = {start, end};
        return ans;        
    }

    public static int findElement(int[] arr, int target) {
        int[] range = getRange(arr, target);
        int start=range[0], end=range[1];

        int index = Arrays.binarySearch(arr, start, end, target);    

        return index;        
    }

    public static void main(String[] args) {
        int[] arr = {-17, -12, -4, 0, 2, 5, 9, 13, 17, 19};
        int target = 5;

        System.out.println(findElement(arr, target));
    }
}
