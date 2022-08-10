package dsa.heaps;

/**
 * Heap
 */
public class Heap {
    static int size = 0;
    static int[] arr = new int[100];

    public static void insert(int val) {
        // increase size
        size += 1;
        int index = size;

        // insert at last pos
        arr[index] = val;

        while(index != 1){
            int parent = index/2;
            if(arr[parent] < arr[index]){
                //swap
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            }
            else{
                break;
            }
            
        }        
    }

    public static void print() {
        for(int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void delete() {
        if(size == 0){
            System.out.println("Heap is already empty!");
            return;
        }

        // swap arr[1] and arr[size]
        int temp = arr[1];
        arr[1] = arr[size];
        arr[size] = temp;

        //size --
        size--;

        //
        int index = 1;
        while(index <= size){
            int left = 2*index;
            int right = 2*index + 1;

            if(left <= size && arr[left] > arr[index]){
                // swap
                index = left;
            } 
            if(right <= size && arr[right] > arr[index]){
                index = right;
            }
            

        }
    }

    public static void main(String[] args) {
        arr[0] = -1;

        insert(60);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        print();
    }


    
}
