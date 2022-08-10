package dsa.io;

import java.io.FileReader;

public class ReadFile {

    public static int[] read(String fileName){
        // declaring array and variables
        int[] ans = new int[3];
        int characters = 0, words = 0, lines = 0;

        // creating a relative file path
        String filePath = "src\\dsa\\io\\" + fileName;

        // executing a try-catch block as FileReader throws FileNotFoundException
        try {
            // creating reference of FileReader to read the file
            FileReader file = new FileReader(filePath);

            int i = -1;

            // iterating untill we find eof - end of file which is given by -1 in the file.read()
            // file.read() returns ascii integer of which respective character needs to be converted 
            while((i = file.read()) != -1){
                char c = (char) i;
                // incrementing character everytime
                characters ++;
                System.out.print(c);
                // if c is a space, comma or full-stop, incrementing number of words
                if(c == ' ' || c == '.' || c == ',')
                    words++;
                // incrementing lines as \n is encountered
                else if(c == '\n')
                    lines++;
                
            }
            // incrementing once again as for the last line in the file \n is not encountered
            lines ++;
            
            // combining variables in an array to return
            ans[0] = characters;
            ans[1] = words;
            ans[2] = lines;

            // closing file reference
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ans;
        

    }

    public static void main(String[] args) {
        // name of the file to read
        String fileName = "profile.txt";
        // calling the function to get a array of number of characters, words, lines
        int[] ans = read(fileName);

        System.out.println();
        System.out.println("char = " + ans[0]);
        System.out.println("words = " + ans[1]);
        System.out.println("lines = " + ans[2]);
        
    }
    
}
