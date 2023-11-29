package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите ваш год рождения: ");
        int year = currentYear - in.nextInt();
        System.out.println(name + " " + year);
    }
}
