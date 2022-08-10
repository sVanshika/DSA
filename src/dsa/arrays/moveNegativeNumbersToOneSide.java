package dsa.arrays;

public class moveNegativeNumbersToOneSide {
    public static void main(String[] args) {
        int[] arr = {12, 11, -13, -5, 7, 8, 9, 3};
        int low=0, high=arr.length-1;

        while (low < high){
            //low<0 & high>0 -> high--
            if(arr[low]<0 && arr[high]>0)
                high--;
            //low<0 & high<0 -> low++
            else if(arr[low]<0 && arr[high]<0)
                low++;
            //low>0 & high<0 -> swap, low++, high--
            else if(arr[low]>0 && arr[high]<0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            //low>0 & high>0 -> high--
            else
                high--;
        }

        for(int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
