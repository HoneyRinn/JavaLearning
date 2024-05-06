package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 1 && num <= 11 && 12-num > 4*60/45) System.out.println("NO");
        else if (num >= 1 && num <= 11)System.out.println("YES");
    }
}
