package dsa.arrays;

import java.util.Arrays;

public class MinPlatforms {
    // Optimized
    public static int calMinPlatformOptimized(int[] arr, int[] dep){
        int n = arr.length;
        int platform = 1;

        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0, j=0, tempPlatform=0;
        for(i=0, j=0; i<n && j<n ;){
            if(arr[i] < dep[j]) {
                tempPlatform++;
                i++;
            }
            else {
                tempPlatform--;
                j++;
            }
            platform = Math.max(platform, tempPlatform);
        }
        return platform;
    }

    // BRUTE -> Time: O(n^2) Space: O(1)
    public static int calMinPlatform(int[] arr, int[] dep){
        int n = arr.length;
        int platform = 1;

        for(int i=0; i<n; i++){
            int tempPlatform = 1;
            System.out.println("i -> arr = " + arr[i] + "\tdep = " + dep[i]);
            for(int j=i+1; j<n; j++){
                if((arr[i] < arr[j] && dep[j] < dep[i]) || (arr[i] < arr[j] && dep[i] > dep[j])) {
                    System.out.println("arr = " + arr[j] + "\tdep = " + dep[j]);
                    tempPlatform++;
                }
            }
            System.out.println("temp platform = " + tempPlatform);
            platform = Math.max(platform, tempPlatform);
        }

        return platform;
    }
    public static void main(String[] args) {
        int[] arr = {900, 940, 1100, 1800, 950, 1500};
        int[] dep = {910, 1200, 1130, 2000, 1120, 1900};

        int minPlatform = calMinPlatformOptimized(arr, dep);
        System.out.println(minPlatform);
    }
}
