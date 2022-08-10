package dsa.searching_sorting;
public class SearchInRotatedSorted {

    public static int search(int[] a, int target){
        if(a.length == 1){
            if(a[0] == target) 
                return 0;
            else
                return -1;
        }

        int targetLine=0, midLine=0, low=0, high=a.length-1;

        while(low <= high){
            
            int mid = low + (high-low)/2;

            System.out.println("low="+low + "\thigh=" + high + "\tmid=" + mid);

            if(a[mid] == target){
                System.out.println("found here at mid = " + mid);
                return mid;
            }

            if(target >= a[0]) targetLine=2;
            else targetLine=1;

            if(a[mid] >= a[0]) midLine=2;
            else midLine=1;

            System.out.println("targetline=" + targetLine + "\tmidline=" + midLine);

            if(targetLine == midLine){ // simple binary search
                System.out.println("same");
                if(target >= a[mid]) 
                    low = mid+1; //right
                else 
                    high = mid-1; //left
            }
            else if (midLine==1 && targetLine==2)
                high = mid-1; //left part
            else
                low = mid+1; //right part

            System.out.println();
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 2, 4, 6, 8};
        int target = 13;
        
        System.out.println("target="+target);
        
        int found = search(arr, target);
        System.out.println("found at = " + found);
    }


    
}
