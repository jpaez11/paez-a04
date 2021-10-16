package baseline;
import java.util.*;
import java.io.*;

public class Employees {
    //table method
    public void Details(String fileName){
        try{
        File f = new File(fileName);
        Scanner scanner = new Scanner(f); //to read the file

            while(scanner.hasNext()){ //loop to parse in the file
                String string = scanner.nextLine();
                String[] tem = string.split(","); //regex used to parse string
                System.out.printf("%-17s%-17s%-17s\n", tem[0], tem[1], tem[2]);
            }
        } catch (FileNotFoundException x) {
            System.out.println("File not found. :(");
        }
    }
}
