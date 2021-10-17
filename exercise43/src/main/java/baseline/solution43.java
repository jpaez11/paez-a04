/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021
 *
 *     Pseudocode:
    websites are pretty cool, let's try and write one
    but this one will prompt the user to:
    give a name for the site
    ask who the author is
    ask user if they want a folder for either JavaScript or CSS files
    and generate an index.html that contains the name of the site
    inside the <title> tag and the author in a <meta> tag
 */

package baseline;
import java.io.*;
import java.text.MessageFormat;
import java.util.*;

public class solution43 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); //user inputs :D

        //initiating strings for the prompts
        String author = null;
        String nameOfSite;
        String path;

        char javaScript= 'N'; //for the javaScript files
        char CSS = 'N'; //this is for the CSS files

        System.out.print("What's the name of the Site? \n");
        nameOfSite= scanner.nextLine();

        System.out.print("Folder for JavaScript?");
        javaScript = scanner.next().charAt(0); //making the folder if selected

        System.out.print("Folder for CSS?");
        CSS = scanner.next().charAt(0); //same, but CSS

        path = System.getProperty("user.directory"); //let's make a directory for the user
        path +=  "//" +nameOfSite; //here's to get the desired site name

        File site = new File(path); //initiating files for the website

        boolean createWebsite = site.mkdir(); //website's directory xd

        //website itself
        if (createWebsite) {

            try {
                //baby's first HTML
                FileWriter skeleton = new FileWriter(new File(path + "\\index.html")); //html pathing
                skeleton.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeleton.write(MessageFormat.format("\t<meta author=\"{0}\">\n", author));
                skeleton.write("\t<title>" + nameOfSite + "</title>\n");
                skeleton.write("</head>\n<body>\n\n</body>\n</html>");
                skeleton.close();
                System.out.println("Created" + path + "\\index.html");

                //javaScript pathing
                File javascriptFolder = new File(path + "\\js");
                boolean javascriptCreated = javascriptFolder.mkdir();
                if (javascriptCreated) {
                    System.out.println("Created " + javascriptFolder + "\\");
                } else {
                    System.out.println("JavaScript folder not created!!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally { //cleaning up

            }
            //CSS pathing
            if(CSS == 'y' || CSS == 'Y')
            {
                File cssFolder = new File(path+"\\css");
                boolean cssCreated = cssFolder.mkdir();
                if(cssCreated)
                {
                    System.out.println("Created " + cssFolder+"\\");
                } else
                {
                    System.out.println("CSS folder not created!!");
                }
            }
        }

    }
}


