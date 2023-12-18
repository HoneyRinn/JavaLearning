package lr3.independentWork;

import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            Random n = new Random();
            array[i] = n.nextInt(99);
            System.out.print(array[i] + " ");
        }
        int index = 0;
        int min = 101;
        for (int i = 0; i < array.length; i++)
        {
            if (array [i] < min)
            {
                min = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Минимальное число: " + min);
        System.out.println("Индекс: " + index);
    }
}
