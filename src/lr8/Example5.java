package lr8;

import java.io.*;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = in.nextLine();

        try{
            File f1 = new File(fileName);
            f1.createNewFile();
            System.out.println("Полный путь к файлу: " + f1.getAbsolutePath());

            System.out.print("Введите количество строк для записи в файл => ");
            int n = in.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            in.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s = in.nextLine();
                dOut.writeUTF(s + "\n");
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) System.out.println(dIn.readUTF());
        } catch (IOException e){
            System.out.println("" + e);
        }
    }
}
