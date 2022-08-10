package dsa.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Factorial {

    public static void addNumber(ArrayList<Integer> factorial, int carry){
        while (carry != 0){
            factorial.add(carry%10);
            carry /= 10;
        }
    }

    public static ArrayList<Integer> findFactorial(int n){
        ArrayList<Integer> factorial = new ArrayList<>();
        factorial.add(1);
        if(n < 2) {
            System.out.println("<2");
            return factorial;
        }

        for(int i=1; i<=n; i++){
            int carry = 0;
            // traversing the arraylist
            for(int index=0; index<factorial.size(); index++){
                int product = i*factorial.get(index) + carry;
                int lastDigit = product%10;
                carry = product/10;
                // replacing the multiplicand with last digit of multiplier
                factorial.set(index, lastDigit);
            }
            if(carry != 0) {
                addNumber(factorial, carry);
            }

            System.out.println("i=" + i);
            factorial.forEach(integer -> System.out.print(integer+" "));
            System.out.println();
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n = 16;
        ArrayList<Integer> fact = findFactorial(n);

        fact.forEach(integer -> System.out.print(integer));
        System.out.println();


//        ListIterator<Integer> itr = fact.listIterator(fact.size());
//        while (itr.hasPrevious())
//            System.out.print(itr.previous() + " ");
//        System.out.println();
    }
}
