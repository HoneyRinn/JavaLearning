package timus.task_1296;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int temp = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++)
        {
            temp += in.nextInt();
            if(answer < temp) answer = temp;
        }
        System.out.println(answer);
    }
}
