
package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
public class FileObject {
    public static void main(String [] args){
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        ObjectInputStream oIn = null;
        ObjectOutputStream oOut = null;
        try{
            fOut = new FileOutputStream("D:/student.txt");
            oOut = new ObjectOutputStream(fOut);
            Student std  = new Student();
            Scanner input = new Scanner(System.in);
            System.out.println("Enter rollNumber");
            std.rollNumber = input.nextLine();
            System.out.println("Enter Student Name");
            std.name = input.nextLine();
            System.out.println("Enter avg mark");
            std.avgMark = input.nextFloat();
            oOut.writeObject(std);
            oOut.close();
            fIn = new FileInputStream("D:/student.txt");
            oIn = new ObjectInputStream(fIn);
            //de-serializable student
            Student ostd = (Student) oIn.readObject();
            System.out.println("de serializabele" + ostd.rollNumber + ostd.name + ostd.avgMark);
        }
        catch(IOException e){
            e.printStackTrace();
        } 
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("finally!");
        }
    }
}
