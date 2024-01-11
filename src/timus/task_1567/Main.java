package timus.task_1567;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        //long startTime = System.currentTimeMillis();
        int count = 0;
        char[] convertedText = text.toCharArray();
        for (int i = 0; i < convertedText.length; i++) {
            if (convertedText[i] <= 96)
                count += convertedText[i] == ' ' ? 1 : (convertedText[i] == '.' ? 1 : (convertedText[i] == ',' ? 2 : 3));
            else
                count += (convertedText[i] % 96) % 3 == 0 ? ((convertedText[i] % 96) % 3) + 3 : (convertedText[i] % 96) % 3;
        }
        System.out.println(count);
        //long endTime = System.currentTimeMillis();
        //long timeElapsed = endTime - startTime;
        //System.out.println(timeElapsed);
    }
}
