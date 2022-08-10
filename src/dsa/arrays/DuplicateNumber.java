package dsa.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateNumber {
    public static int firstRepeating(int[] nums){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet())
            if(e.getValue() > 1)
                return e.getKey();
        return Integer.MIN_VALUE;
    }

    public static int firstNonRepeating(int[] nums){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e: map.entrySet())
            if(e.getValue() == 1)
                return e.getKey();
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 3, 4, 3, 5, 6};
//        System.out.println("First Repeating = " + firstRepeating(nums));
//        System.out.println("First Non Repeating = " + firstNonRepeating(nums));

        System.out.println(2^3);
    }
}
