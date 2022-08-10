package dsa.arrays;

public class Palindrome {
    public static boolean check(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,9,3,1};

        System.out.println(check(arr));
    }
}
