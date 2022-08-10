package dsa.searching_sorting;

public class RotiPrata {

    public static void temp(int[] ranks) {

        for(int min=1; min<=3; min++){
            System.out.println("\nmin = " + min);
            for(int i=0; i<ranks.length; i++){
                int rank = ranks[i];
                double value = (min*2*4)/rank;
                double sqrt = Math.sqrt(value);
                double ans = Math.floor((sqrt-1)/2);
                System.out.println("rank = " + rank + "\tans = " + ans);    
            }
        }
        
    }

    public static void main(String[] args) {
        int[] ranks = {1,2,3,4};
        temp(ranks);
    }
    
}
