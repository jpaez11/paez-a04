/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021
 *   Psuedocode:
    reading a  text file, that will soon be modified via using a word to
    find the said word. ex: using 'utilize' to replace 'use.'

 */
package baseline;
import java.io.*;
import java.util.*;

public class solution45 {
 public static void main (String []args) throws IOException{ //driver method
    Scanner scanner = new Scanner(System.in);
    System.out.print("\n Enter the output file, please: ");
    String outFile = scanner.next();

    //creating an object and reading the file
     FileRead fr = new FileRead();

     ArrayList<String> list = fr.getData(); //getting the list that contains data

     //creating another object to pass the file output and contained data
     writingFile wf = new writingFile(outFile, list);



 }

}
