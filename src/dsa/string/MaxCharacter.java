package dsa.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxCharacter {
    public static char getMaxOccuringChar(String line){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<line.length(); i++){
            char key = line.charAt(i);
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int max = -1;
        char maxOccurChar = map.keySet().iterator().next();

        System.out.println(maxOccurChar);

        for(Map.Entry<Character, Integer> entry: map.entrySet() ){
            int value = entry.getValue();
            char key = entry.getKey();
            System.out.println(key + " - " + value);

            if(value > max){
                max = value;
                maxOccurChar = key;
            }
            else if(value == max){
                maxOccurChar = (key < maxOccurChar) ? key : maxOccurChar;
                System.out.println("now max is - " + maxOccurChar);
            }
        }

        return maxOccurChar;    
    }

    public static void main(String[] args) {
        String line = "output";
        // System.out.println("Max occuring char ->" + getMaxOccuringChar(line));

        StringBuilder str = new StringBuilder("my name is vanshika");
        System.out.println(str);
        
        int indexOfSpace = Integer.MIN_VALUE;
        while(indexOfSpace != -1){
            indexOfSpace = str.indexOf(" ");
            if(indexOfSpace != -1)
                str = str.replace(indexOfSpace, indexOfSpace+1, "@40");            
        }

        System.out.println(str);

        

    }
    
}
