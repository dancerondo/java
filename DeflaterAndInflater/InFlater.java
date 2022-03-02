
package DeflaterAndInflater;

import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class InFlater {
    public static void main(String [] args) throws Exception{
        String input = "Trong dam gi dep bang sen"
                + "La xanh bong trang lai chen nhuy vang";
        byte [] inputObj = input.getBytes("UTF-8");
        
        //compress the byte
        byte [] output = new byte[100];
        Deflater deflater = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDatalength = deflater.deflate(output);
        System.out.println(compressDatalength);
        
        //decompress the byte
        Inflater inflater = new Inflater();
        inflater.setInput(output, 0, output.length);
        byte [] resultObj = new byte[100];
        int resultLength = inflater.inflate(resultObj);
        inflater.end();
        
        //decode the byte into String
        String strOutput =  new String(resultObj,0,resultLength,"UTF-8");
        System.out.println("Recover String is : " + strOutput);
    }
}
