package dsa.arrays;
public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {2,7,5,6,9,8,1};
        for(int i=1; i<arr.length; i=i+2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        for(int i: arr)
            System.out.print(i+" ");
    }
}
