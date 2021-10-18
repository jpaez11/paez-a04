/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021
 *
 *
    Pseudocode:
    using an array, this program will count the amount of times
    a word is used in a file. and then will prompt the amount of times
    the word was used via histogram.
*
*/

package baseline;
import java.io.*;

public class solution46 {
    public static void main(String[] args) throws IOException{
        File file1=new File("exercise46_input.txt"); //creating the text file
        String[] words=null; //array for the words
        //objects for the file, and reading of
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);

        String s;

        String in="badger"; //searching
        int count=0; //it starts at 0

            //starting a while loop to read content from the file
        while((s=br.readLine())!=null)
        {
            words=s.split(" "); //making it look cleaner
            for (String word : words)

            {
                if (word.equals(in)){ //time to actually search
                    count++; //if the word shows up +1
                }

            }

        }
        if(count!=0){ //to make sure it isn't zero
            System.out.println("Here's how many times the word: "+count+ " was used. ");
        } else {
            System.out.println("The typed word is not in the file!");
        }
        fr.close(); //avoiding any mem leak
    }
}