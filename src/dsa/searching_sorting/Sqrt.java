package dsa.searching_sorting;


public class Sqrt {

    public static double getSqrt(int target, int precision) {
        double ans = 0;

        int low=0, high=target/2;

        while(low <= high){
            int mid = low + (high-low)/2;
            int midSquare = mid*mid;

            System.out.println(low + " " + high + " " + mid);

            // if(midSquare == target){
            if(mid == target/mid){
                System.out.println("returning mid = " + mid);
                return mid;
            }

            if(mid < target/mid && (mid+1) > target/(mid+1)){
                System.out.println("breaking");
                ans = mid;
                break;
            }

            if(mid < target/mid)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("formatting ans = " + ans);

        for(int i=1; i<=precision; i++){
            double multiplier = 1/Math.pow(10, i);
            double ans2 = 0;
            int j=0;
            for(j=1; j<=9; j++){
                ans2 = ans + j*multiplier;
                if(ans2*ans2 > target){
                    break;
                }
            }
            ans = ans + (j-1)*multiplier;
        }

        return ans;
    }

    public static void main(String[] args) {
        int target = 2147395599;

        double sqrt = getSqrt(target, 3);

        System.out.println(sqrt);
        System.out.println(Math.sqrt(target));
    }
    
}
