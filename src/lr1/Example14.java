package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println((num-1) + " " + num + " " + (num+1) + " " + Math.pow(3*num, 2));
    }
}
