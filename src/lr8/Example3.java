package lr8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3 {
    public static void readAllByByte(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true){
            int count = in.read(buff);
            if(count != -1){
                System.out.println("количество = " + count + ", buff = " + Arrays.toString(buff)
                 + ", str = " + new String(buff, 0, count, "cp1251"));
            }
            else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String fileName = "E:\\MyFile2.txt";
        InputStream inFile = null;

        try{
            inFile = new FileInputStream(fileName);
            readAllByByte(inFile);
        } catch (IOException e){
            System.out.println(fileName+ "\n" + e);
        } finally {
            if (inFile != null){
                try{
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
