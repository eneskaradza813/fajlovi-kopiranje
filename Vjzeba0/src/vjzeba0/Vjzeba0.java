
package vjzeba0;

import java.io.*;
public class Vjzeba0 {

  
    public static void main(String[] args) {
      
        
        
        File aFile = new File("C:\\Javalearning\\Vjzeba10\\forCopy.txt");
        File bFile = new File("C:\\Javalearning\\Vjzeba10\\copied.txt");
        
        try(FileInputStream inStream = new FileInputStream(aFile);
                FileOutputStream outStream = new FileOutputStream(bFile);)
        {
            byte[] buffer = new byte[1024];
            int length;
            
            while((length = inStream.read(buffer)) > 0)
            {
                outStream.write(buffer, 0, length);
            }
            
        }catch(IOException exc){
            System.out.println(exc);
        }

        
    }
    
}
