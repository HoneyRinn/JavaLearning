package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value = 0;
        if (n >= -10000 && n <= 10000)
        {
            if (n > 0)
            {
                for (int i = 1; i <= n; i++)
                    value += i;
                System.out.println(value);
            }
            else {
                for (int i = 1; i >= n; i--)
                    value -= i;
                System.out.println("-"+value);
            }
        }
    }
}
