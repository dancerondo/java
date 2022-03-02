
package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Input_Output_Stream {
    public static void main(String [] args) throws IOException{
        FileInputStream inObj = null;
        FileOutputStream outObj = null;
        try{
            inObj = new FileInputStream("D:/Study/Aptech/Java/Handling_File/fileIn.txt");
            outObj = new FileOutputStream("D:/Study/Aptech/Java/Handling_File/fileOut.txt");
            int ch;
            while((ch = inObj.read()) != -1){
                outObj.write(ch);
            }        
        }
        finally{
            if(inObj.read() != -1)
                inObj.close();
            if(outObj != null)
                outObj.close();
        }
    }
}
