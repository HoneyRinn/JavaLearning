package lr3.independentWork;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size;
        try {
            size = in.nextInt();
            if (size == 0)
            {
                System.out.println("Тут пусто");
                System.exit(0);
            }
            int[] array = new int[size];
            for (int i = 0; i < size; i++) array[i] = 2 + 5*i;
            System.out.println("Итог: ");
            for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
        }
        catch (Exception e)
        {
            System.out.println("Вы ввели не корректное значение! ");
        }
    }
}
