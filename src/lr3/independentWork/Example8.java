package lr3.independentWork;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        char letter = 65;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество букв в массиве: ");
        int size = in.nextInt();
        char[] array = new char[size];
        for (int i = 0; i < size; )
        {
            if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y')
            {
                letter++;
            }
            else
            {

                array[i] = letter;
                i++;
                letter++;
            }
        }
        System.out.println("Итог: ");
        for (int i = 0; i < size; i++) System.out.print(array[i]);
    }
}
