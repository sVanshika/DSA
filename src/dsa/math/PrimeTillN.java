package dsa.math;

import java.util.ArrayList;
import java.util.Collections;

// Ques: find prime numbers till n

public class PrimeTillN {

    public static int soe(int n) {
        int count = 0;

        ArrayList<Boolean> prime = new ArrayList<>(n+1);
        Collections.fill(prime, true);

        return 0;

        
        
    }
    
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Count is -> " + soe(n));
    }

}
