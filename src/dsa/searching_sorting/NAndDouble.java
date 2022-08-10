package dsa.searching_sorting;

import java.util.Arrays;
import java.util.HashSet;

public class NAndDouble {

    // brute -> time=O(n^2) space=O(1)
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == 2*arr[j] || 2*arr[i] == arr[j]){
                    System.out.println(arr[i] + " " + arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkIfExistOptimal(int[] arr) {
        int n = arr.length;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains(arr[i]/2)))
                return true;
            else
                set.add(arr[i]);
        }

        return false;
        
    }

    public static int[] checkIfExistBinarySearch(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            // positive number
            if(arr[i] >= 0){
                int index = Arrays.binarySearch(arr, arr[i]*2, i+1, n-1);
                if(index != -1){
                    ans[0] = i;
                    ans[1] = index;
                    return ans;
                }
            }
            // neagtive and even
            if((arr[i] < 0) && (arr[i] % 2 == 0)){
                int index = Arrays.binarySearch(arr, i+1, n-1, arr[i]/2);
                if(index != -1){
                    ans[0] = i;
                    ans[1] = index;
                    return ans;
                }
                    
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,8,2,3};
        // System.out.println(checkIfExist(arr));

        int[] ans = checkIfExistBinarySearch(arr);
        if(ans != null){
            System.out.println(ans[0] + " " + ans[1]);
        }
        else
            System.out.println("false");
    }
    
}
