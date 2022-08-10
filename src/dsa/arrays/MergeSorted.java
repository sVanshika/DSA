package dsa.arrays;

public class MergeSorted {
    public static void insertionSort(int[] arr){
        int temp = arr[0];
        boolean inserted = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < temp){
                arr[i-1] = arr[i];
            }
            else{
                arr[i-1] = temp;
                inserted = true;
                break;
            }
        }
        if(!inserted)
            arr[arr.length-1] = temp;
    }
    public static void mergeWithoutExtraSpace(int[] arr1, int[] arr2){
        int n1 = arr1.length;

        int i=0;
        while(i < n1){
            System.out.print("i=" + i + "\tarr1 -> ");
            for(int x: arr1) System.out.print(x+" ");
            System.out.print("\t\tarr2 -> ");
            for(int x: arr2) System.out.print(x+" ");
            System.out.println();

            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                insertionSort(arr2);
            }
            i++;
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int n1= arr1.length, n2=arr2.length;
        int[] merged = new int[n1+n2];
        // int i=0, j=0, k=0;
        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,7,11,14};
        int[] arr2 = {2,6,8,10,13,17};

        mergeWithoutExtraSpace(arr1, arr2);

        for(int i: arr1)
            System.out.print(i+" ");
        System.out.println();
        for (int i: arr2)
            System.out.print(i+" ");
        System.out.println();
    }
}
