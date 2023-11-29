package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int year = currentYear - in.nextInt();
        System.out.println("Вы родились в " + year + " году");
    }
}
