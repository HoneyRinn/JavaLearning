package lr3.independentWork;

import java.util.Scanner;

public class Example5_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        int size = in.nextInt();
        int[] array = new int[size];
        int sum = 0, count = 0;
        for (int i = 0; i < size; i++)
        {
            System.out.println("Введите " + (i+1) + " число: ");
            array[i] = in.nextInt();
            if (array[i] % 5 == 2 || array[i] % 3 == 1)
            {
                count++;
                sum += array[i];
            }
            else System.out.println("Число не попадает под требования");
        }
        System.out.println("Количество удволетворяющих чисел: " + count);
        System.out.println("Сумма чисел: " + sum);
    }
}
