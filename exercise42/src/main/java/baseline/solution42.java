/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jorge Paez
 *
 Pseudocode:
    making a program that parses in a data file, the records will be processed
    and formatted as a table.

 */
package baseline;
import java.io.*;
import java.util.*;

public class solution42 {
    public static void main(String [] args){ //driving
        Employees employee = new Employees(); //calling the Employee class

       System.out.printf("%-17s%17-s%17s\n", "Last Name", "First Name", "Current Salary" );
        System.out.println("----------------------------------------"); //making the table
        employee.Details("exercise42_input.txt");
    }

}
