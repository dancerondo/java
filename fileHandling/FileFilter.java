
package fileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter{
    String str;
    FileFilter(String ext){
        this.str = "."+ext;
    }
    @Override
    public boolean accept(File dirName, String fName) {
        return fName.endsWith(str);
    }
    public static void main(String [] args){
        String dirName = "D:/Study/Aptech/Java/Handling_File";
        File fileobj = new File("D:/Study/Aptech/Java/Handling_File");
        FilenameFilter filterobj = new FileFilter("txt");
        String [] fileName = fileobj.list(filterobj);
        System.out.println("Number of file found:" + fileName.length);
        System.out.println("Name of file is:");
        for(int i = 0;i < fileName.length;i++){
            System.out.println(fileName[i]);
        }
    }
}


