
package fileHandling;

import java.io.File;

public class FileHandling {
    //phuong thuc liet ke thu muc con chau bang de quy
    public void fletChild(File file){
        if(file.isDirectory()){
            File[] children = file.listFiles();
            for(File  child :children){
                this.fletChild(child);
                System.out.println(child);                
            }
        }
    }
    
    public static void main(String [] args){
    //File objFile = new File("D:/Study/Aptech/Java/Handling_File/Hello.txt");
     File objFile = new File("D:/Study/Aptech/Java/Handling_File");   
     System.out.println("File path is:" + objFile.getPath());
     System.out.println("File name is :" + objFile.getName());
     System.out.println("File exist is : " + objFile.exists()); 
     System.out.println("File is :" + objFile.isFile());
     //2.Liet ke tat ca cac thu muc go
     File[] roots = File.listRoots();
        System.out.println("Cac thu muc goc la : ");
     for(File root:roots){
         System.out.println(root.getAbsolutePath());
     }
     //3.Liet ke tat ca cac thu muc va tap tin con truc tiep cua 1 thu muc
        System.out.println("Thu muc con va tap tin con truc tiep");
        File[] children = objFile.listFiles();
        for(File children1 : children){
            System.out.println(children1.getAbsolutePath());          
        }
     //4.Liet ke thu muc con chau
        System.out.println("Thu muc con chau la :" );
        FileHandling fhdl = new FileHandling();
        fhdl.fletChild(objFile);
    }   
}
