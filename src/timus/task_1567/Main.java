package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        //long startTime = System.currentTimeMillis();
        int count = 0;
        char[] convertedText = text.toCharArray();
        for (char c : convertedText) {
            if (c <= 96)
                count += c == ' ' ? 1 : (c == '.' ? 1 : (c == ',' ? 2 : 3));
            else
                count += (c % 96) % 3 == 0 ? ((c % 96) % 3) + 3 : (c % 96) % 3;
        }
        System.out.println(count);
        //long endTime = System.currentTimeMillis();
        //long timeElapsed = endTime - startTime;
        //System.out.println(timeElapsed);
    }
}
