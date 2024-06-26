package lr8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void readAllByByte(InputStream in) throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.print((char) oneByte);
            }
            else {
                System.out.print("\nend");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try{
            InputStream inFile = new FileInputStream("e:/MyFile2.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://www.google.com/").openStream();
            readAllByByte(inUrl);
            System.out.print("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {2, 3, 4, 5, 5});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        } catch (IOException e){
            System.out.print(e);
        }
    }
}
