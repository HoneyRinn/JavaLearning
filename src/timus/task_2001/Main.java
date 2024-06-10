package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basket1_1 =in.nextInt();
        int basket2_1 =in.nextInt();
        int basket1_2 =in.nextInt();
        int basket2_2 =in.nextInt();
        int basket1_3 =in.nextInt();
        int basket2_3 =in.nextInt();

        int berries_1 = basket1_1 - basket1_3;
        int berries_2 = basket2_1 - basket2_2;

        System.out.print(berries_1 +" "+ berries_2);
    }
}
