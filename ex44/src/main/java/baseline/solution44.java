/*

UCF COP3330 Fall 2021 Assignment 4 Solutions
Copyright 2021 Jorge Paez

   Pseudocode:
   this program will take a product name that retrieves the current
   price in a data file in JSON. essentially, it will be parsed thru
   JSON.

   note:
   (idk why the JSON isn't being read, please help)
    */

package baseline;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class solution44 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser(); //creating a JSON parser
        try {
            //to read a file, a parser will be used and stored in an object
            Object ob = parser.parse(new FileReader("D:/product.json"));
            JSONObject jsonObject = (JSONObject) ob;
            JSONArray subj = (JSONArray) jsonObject.get("products"); //making an array to read the products from file
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in)); //user inputs

            String in;
            int i = 0;
            System.out.print("What's the name of the product?");
            in = bufferedReader.readLine(); //reading inputs

            //creating iterations for the array
            Iterator it = subj.it();

            //making a loop for the iterator
            while (it.hasNext()) {
                JSONObject jSON = (JSONObject) it.next(); //another JSON

                //getting the value for the name
                String names = (String) jSON.get("names");

                //time to compare with the given
                if (in.toLowerCase().equals(names.toLowerCase())) {
                    System.out.println("Name: " + names);
                    System.out.println("Price: " + jSON.get("price"));
                    System.out.println("Quantity: " + jSON.get("quantity"));
                    i = 1;
                }
                if (i == 0) { //if value is zero, then it isn't found
                    System.out.println("Product not found, please try again.");
                }
            }
            catch(Exception e){
                e.printStackTrace();


            }
        }
