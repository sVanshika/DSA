package dsa.problem_solving;

public class pattern {
    public static void main(String[] args) {

        /*int n=5;
        for(int row=1; row<=n; row++){
            // space
            for(int col=1; col<=(row-1); col++)
                System.out.print(" ");

            // star
            for(int col=1; col<=(n-row+1); col++)
                System.out.print("*");

            System.out.println();
        }*/

        // full pyramid
        /*int n=5;
        for(int row=1; row<=n; row++){
            // spaces
            for(int col=1; col<=(n-row); col++)
                System.out.print("_");
            // stars
            for(int col=1; col<=row; col++)
                System.out.print("_*");
            System.out.println();
        }*/

        // inverted pyramid
        /*int n=5;
        for(int row=1; row<=n; row++){
            // spaces
            for(int col=1; col<=(row-1); col++)
                System.out.print(" ");
            // stars
            for(int col=1; col<=(n-row+1); col++)
                System.out.print("* ");
            System.out.println();
        }*/

        // hollow inverted half pyramid
        int n=16;
        for(int row=1; row<=n; row++){
            if(row==1 || row==n){
                for(int col=1; col<=(n-row+1); col++)
                    System.out.print("*");
            }
            else{
                // starting star
                System.out.print("*");
                // space
                for(int col=1; col<=(n-row-1); col++)
                    System.out.print(" ");
                // ending star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
