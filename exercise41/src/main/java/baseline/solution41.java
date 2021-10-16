/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jorge Paez
 *
    Pseudocode:
    using a text file, the program will read a list of names
    and will also sort them alphabetically

 */

package baseline;
import java.io.*;
import java.util.*;
public class solution41 {
    public static void main (String [] args) throws FileNotFoundException{ //driver method to run
        Scanner file = new Scanner(new File ("exercise41_input.txt")); //here's how the file will be stored
        //now to store the names
        ArrayList<String> names = new ArrayList<String>();
        readN(file, names); //calling the file by using the function readN()
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER); //sorting...
        file.close();

        //outputting the file
        try {
            outputN(names);
        } catch (Exception x){ //just in case an exception happens to the file
            System.out.println(x);
        }

    }

    private static void outputN(ArrayList<String> names) {
    }

    private static void readN(Scanner file, ArrayList<String> names) {
    }


}
