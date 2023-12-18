package lr3.independentWork;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            Random n = new Random();
            array[i] = n.nextInt(99);
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.println();
        for (int j : array) System.out.print(j + " ");
        System.out.println();
        for (int i = 0; i < array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - i - 1] = temp;
        }
        for (int j : array) System.out.print(j + " ");
    }
}
