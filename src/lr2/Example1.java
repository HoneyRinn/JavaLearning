package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if(num % 3 == 0)
            System.out.println("Это число делится на 3");
        else System.out.println("Это число не делится на 3");
    }
}
