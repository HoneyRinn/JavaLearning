package timus.task_1313;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        int[][] arr = new int[line][line];
        int[] arrAnswer = new int[line * line];
        int buff;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                arr[i][j] = in.nextInt();
                arrAnswer[(i * line) + j] = arr[i][j];
            }
        }
        for (int i = 1; i < arrAnswer.length ; i++) {
            for (int j = arrAnswer.length-1; j >= i; j--) {
                if(arrAnswer[j-1] > arrAnswer[j]) {
                    buff = arrAnswer[j];
                    arrAnswer[j] = arrAnswer[j-1];
                    arrAnswer[j-1] = buff;
                }
            }
        }
        System.out.println(Arrays.toString(arrAnswer));
    }
}
