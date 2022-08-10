package dsa.problem_solving;

public class HomeworkPatterns {
    public static void main(String[] args) {
        // hollow pyramid
        int n=19, mid=n/2;
        for(int row=1; row<=n; row++){
            if(row == 1 || row == n) {
                for(int col=1; col<=mid; col++) System.out.print("  ");
                System.out.print("*");
            }
            else if(row < (mid+1)){ // upper half
                // space
                for(int col=1; col<=(mid-row+1); col++)
                    System.out.print(" ");
                // combo
                System.out.print("*");
                for (int col = 1; col <= (row - 1); col++)
                    System.out.print("  ");
                System.out.print("*");
            }
            else if(row == (mid+1)){// middle line
                System.out.print("*");
                for(int col=1; col<=mid; col++)
                    System.out.print("  ");
                System.out.print("*");
            }
            else{// lower half
                // space
                for(int col=1; col<=(row-mid-1); col++)
                    System.out.print(" ");
                // combo
                System.out.print("*");
                for (int col = 1; col <= (n - row); col++)
                    System.out.print("  ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
