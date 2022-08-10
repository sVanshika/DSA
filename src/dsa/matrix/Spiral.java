package dsa.matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral {

    public static List<Integer> printSpiral(int[][] arr) {
        int totalRows = arr.length, totalCol = arr[0].length, totalElements = totalRows*totalCol;
        int firstRow = 0, firstCol = 0, lastRow = totalRows-1, lastCol = totalCol-1;
        int elementPrinted = 0;

        List<Integer> spiral = new ArrayList<>();
        
        while(elementPrinted != totalElements){
            // printing first row
            for(int i=firstCol; i<=lastCol; i++){
                spiral.add(arr[firstRow][i]);
                elementPrinted++;
            }
            firstRow++;

            // printing last col
            for(int i=firstRow; i<=lastRow; i++){
                spiral.add(arr[i][lastCol]);
                elementPrinted++;
            }
            lastCol--;

            // printing last row
            for(int i=lastCol; i>=firstCol; i--){
                spiral.add(arr[lastRow][i]);
                elementPrinted++;
            }
            lastRow--;

            // printing first col
            for(int i=lastRow; i>=firstRow; i--){
                spiral.add(arr[i][firstCol]);
                elementPrinted++;
            }
            firstCol++;
        }

        return spiral;
    }


    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}};
        List<Integer> spiral = printSpiral(arr);

        spiral.forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
    
}
