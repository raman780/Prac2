//File handling :

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //code to create a new file
//        File myFile = new File("Employee.txt");
//        try{
//            myFile.createNewFile();
//        } catch (IOException e){
//            System.out.println("Unable to create this file");
//        }
//
//        //code to write a file
//        try {
//            FileWriter fileWriter = new FileWriter("Employee.txt");
//            fileWriter.write("This is a first file");
//            fileWriter.close();
//        } catch (IOException e){
//            e.printStackTrace();

        //Reading a file
        File mFile = new File("Employee.txt");
        try{
        Scanner sc = new Scanner(mFile);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        }
    }
//}
