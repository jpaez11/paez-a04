package baseline;
import java.io.*;
import java.util.*;

//creating a class to read the file
public class FileRead {
    //variables being made
    private ArrayList<String> list;
    private Scanner scanner;

    //constructing
    public FileRead() throws FileNotFoundException {
        list = new ArrayList<String>();

        //time to initialize the instance variables
        File file = new File("C:\\Users\\Desktop\\ exercise45_input.txt"); //pathing
        new Scanner(file);


    }

    private void readile() {
        //avoiding exceptions
        try {
            int o = 0;
            while (scanner.hasNext()) {
                //reading the file, but line by line to store to the list
                String fData = scanner.nextLine();
                list.add(fData);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getData() {
        return null;
    }
}
