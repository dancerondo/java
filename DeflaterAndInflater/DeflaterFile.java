
package DeflaterAndInflater;

import java.io.UnsupportedEncodingException;
import java.util.zip.Deflater;


public class DeflaterFile {
    public static void main(String [] args) throws Exception{
        //Encode a String into byte
        String input = "Trong dam gi dep bang sen."
                + "La xanh bong trang lai chen nhuy vang";
        byte [] inputObj = input.getBytes("UTF-8");
        //Compress the bytes
        byte [] output = new byte[100];
        Deflater deflater  = new Deflater();
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDatalength = deflater.deflate(output);
        System.out.println(compressDatalength);
    }
}
