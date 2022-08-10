package dsa.searching_sorting;

import java.util.Vector;


public class FixedPoint {

    // multiple fixed points
    public static void calFixedPoint(int[] arr, Vector<Integer> ans, int low, int high) {
        if(low > high)
            return;
        int mid = low + (high-low)/2;
        System.out.println("low=" + low + "\thigh=" + high + "\tmid=" + mid);

        if(arr[mid] == mid){
            System.out.println("found at "+mid);
            ans.add(mid);
            // search left
            calFixedPoint(arr, ans, low, (mid-1));
            // search right
            calFixedPoint(arr, ans, (mid+1), high);
            
        }
        else if(arr[mid] > mid) // left part
            calFixedPoint(arr, ans, low, (mid-1));
        else // right part
            calFixedPoint(arr, ans, (mid+1), high);
        
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3};
        Vector<Integer> ans = new Vector<>();

        calFixedPoint(arr, ans, 0, (arr.length-1));

        ans.forEach(i -> System.out.println(i));
    }
    
}
