package baseline;

import java.io.*;
import java.util.*;

//class to write into the file
public class writingFile {
    private FileWriter writer;
    private int countModify;
    private ArrayList<String> list;

    public writingFile(String name, ArrayList<String> list) throws IOException {
        //initialize variables
        writer = new FileWriter("C:\\Users\\Desktop\\" + name);
        this.list = list;

        //writing into the file time


            //loops, for the size of the list
            for (int i = 0; i < list.size(); i++) {
                String tem = list.get(i);
                String st = "utilize";
                int index = 0;

                //counting the modifiers
                while (true) {
                    index = tem.indexOf(st, index);
                    if (index != -1) {
                        countModify++;
                        index += st.length();
                    } else {
                        break;
                    }
                }
            }
        }


public int getCountModify() {
    return countModify;
    }

    public void getModification() {
    }
}

