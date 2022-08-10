package dsa.string;

public class Palindrome {

    public static boolean checkPalindrome(String str) {
        StringBuffer str2 = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            int ascii = (int) str.charAt(i);
            if((48<=ascii && ascii<=57) || (97<=ascii && ascii<=122)) //digits and small letter 
                str2.append(str.charAt(i));
            if((65<=ascii && ascii<=90)){ //capital letters
                char smallCaseEquivalent = (char) (ascii+32);
                str2.append(smallCaseEquivalent);
            }
        }

        System.out.println(str2);

        int i=0, j=str2.length()-1;
        while(i <= j){
            if(str2.charAt(i) == str2.charAt(j)){
                i++;
                j--;
            }
            else
                return false;
        }

        return true;  
	 
	}

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println("Palin -> " + checkPalindrome(str));


    }
    
}
