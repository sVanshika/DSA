package dsa.arrays;

public class two_d_array {
    public static void printArr(int[][] a, int row, int col) {
        for (int[] rows : a){
            for (int i : rows) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static boolean search(int[][] a, int rows, int col, int target){
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(a[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    public static void columnSum(int[][] a, int rows, int col){
        int max = 0;
        for(int i=0; i<rows; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum += a[i][j];
            }
            max = (sum > max) ? sum : max;
            System.out.println(sum);
        }
        System.out.println("Max:"+max);
    }

    // brute -> extra array space
    public static void reverse(int[][] a, int row, int col){
        int[][] b = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                b[j][col-i-1] = a[i][j];
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseOptimal(int[][] a, int row, int col){
        // 1. transpose
        // 2. reverse rows

        // transpose
        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // reverse rows
        for(int r=0; r<row; r++){
            int i=0, j=col-1;
            while (i<j){
                // swap a[r][i] and a[r][j]
                int temp = a[r][i];
                a[r][i] = a[r][j];
                a[r][j] = temp;
                i++;
                j--;
            }
        }


        printArr(a, row, col);
    }

    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,3},
                {4,5,6,3},
                {7,8,9,3}};

        int rows = a.length;
        int col = a[0].length;
        System.out.println(rows + " " + col);
//        System.out.println(search(a, 3, 3, 6));
//        columnSum(a, 3,3);
//        reverse(a,3,3);
        reverseOptimal(a,3,3);
    }
}
