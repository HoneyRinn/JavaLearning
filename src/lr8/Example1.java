package lr8;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try{
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.printf("Создан!\n");
                System.out.printf("Путь к файлу: " + f1.getAbsolutePath() + "\n");
            }

            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.printf("Путь к 2 файлу: " + f2.getAbsolutePath() + "\n");

            File f3 = new File("E:\\directory1\\dir2\\dir3");
            f3.mkdirs();
            System.out.printf("Путь директорий: " + f3.getAbsolutePath() + "\n");
        }
        catch (Exception e){
            System.out.printf("Ошибка: " + e);
        }
    }
}
