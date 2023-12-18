package lr3.independentWork;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        char letter = 97;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size = in.nextInt();
        char[] array = new char[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = letter;
            letter += 2;
        }
        System.out.println("Итог: ");
        for (int i = 0; i < size; i++) System.out.print(array[i]);
        System.out.println();
        System.out.println("Реверс: ");
        for (int i = size - 1; i >= 0; i--) System.out.print(array[i]);
    }
}
