package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.print("В " + num + " числе ");
        num = num % 10000 / 1000;
        System.out.print(num + " тыщ");
    }
}
