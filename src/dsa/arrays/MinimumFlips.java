package dsa.arrays;

public class MinimumFlips {

    public static void main(String[] args) {
        String arr = "0001010111";
        int n = arr.length();

        int flipsInZero = 0, flipsInOne = 0;

        char bit = '0';
        for(int i=0; i<n; i++){
            System.out.println(arr.charAt(i) + "  " + bit);
            if(arr.charAt(i) != bit)
                flipsInZero++;
            bit = (bit == '1') ? '0' : '1';
        }

        System.out.println();

        bit = '1';
        for(int i=0; i<n; i++){
            System.out.println(arr.charAt(i) + "  " + bit);
            if(arr.charAt(i) != bit)
                flipsInOne++;
            bit = (bit == '1') ? '0' : '1';
        }

        System.out.println("0 -> " + flipsInZero + "\n1 -> " + flipsInOne);
        System.out.println(Math.min(flipsInOne, flipsInZero));

       

    }
}
