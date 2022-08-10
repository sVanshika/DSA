package dsa.arrays;

public class CharArray {

    public static int getLength(char[] arr) {
        for(char c: arr)
            System.out.println(c);
        
        return 0;
    }

    public static void main(String[] args) {
        char[] arr = {'v', 'a', 'n'};
        getLength(arr);

    }
    
}
