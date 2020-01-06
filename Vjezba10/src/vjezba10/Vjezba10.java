package vjezba10;

import java.io.*;


public class Vjezba10 {

    public static void main(String[] args) {

        /*File testDirectory = new File("C:\\Javalearning\\Vjzeba10\\test");
        if(!testDirectory.exists()){
            testDirectory.mkdir();
            System.out.println("Created directory called: " + testDirectory.getName());
        }else{
            System.out.println("Directory already exists");
        }*/

        File oldFile = new File("C:\\Javalearning\\Vjzeba10\\test");
        File newFile = new File("C:\\Javalearning\\Vjzeba10\\javaTest");
        
        if(!oldFile.exists()){
            System.out.println("File doesn't exists");
            return;
            
        }
        if(newFile.exists())
        {
            System.out.println("File already exists");
            return;
        }
        if(oldFile.renameTo(newFile)){
            System.out.println("Rename succesful");
        }else{
            System.out.println("Rename falled");
        }
    }

}
