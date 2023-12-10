package timus.task_1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value = 0;
        for (int i = 1; i <= n; i++) {
            int k = (int) ((in.nextInt() + in.nextInt()) * Math.pow(10, (n-i)));
            value += k;
        }
        if (value > (Math.pow(10, n) - 1))
            System.out.println("Error");
        else System.out.println(value);
    }
}
