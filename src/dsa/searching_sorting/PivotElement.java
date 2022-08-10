package dsa.searching_sorting;

public class PivotElement {

    // OPTIMAL -> Binary Search
    public static int findPivotOptimal(int[] a) {
        int low = 0, high = a.length-1;
        
        while(low < high){
            int mid = low + (high-low)/2;
            if(a[mid] >= a[0]) // 2nd line shift to left part
                low = mid+1;
            else // 1st line shift to right part
                high = mid;
        }

        return low;
    }


    // BRUTE -> linear search -> O(n)
    public static int findPivot(int[] a){
        int n = a.length;
        // if last element is pivot
        if(a[n-1] < a[n-2])
            return a[n-1];

        for(int i=0; i<(n-1); i++){
            // ascending
            System.out.println(i);
            if((a[i+1] < a[i] && a[i+2] >= a[i+1] ) ){
                System.out.println("here = " + i);
                return a[i+1];
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0};
        int pivotElement = findPivotOptimal(arr);
        System.out.println(pivotElement);
    }
    
}
