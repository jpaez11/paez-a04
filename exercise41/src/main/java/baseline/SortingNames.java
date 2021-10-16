package baseline;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SortingNames {
    //defining a function to read data from
    public static void readN(Scanner in, ArrayList<String> names) {
        //now to read the data
        while (in.hasNextLine()) {
            //adding names
            names.add(in.nextLine());

        }
    }

    //defining function to output the names from
    public static void outputN(ArrayList<String> names) throws IOException {
        //creating a function to read the file
        FileWriter out = new FileWriter(("exercise41_output.txt"));
        out.write("Total of" + names.size() + " names \n");
        out.write("----------------- \n"); //neat separation

        //writing the names of the file, after headers and separation
        for (String n : names) {
            out.write(n + "\n"); //showing the names
        }
        out.close(); //closing the output to avoid memory leaking
    }
}