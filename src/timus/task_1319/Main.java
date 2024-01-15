package timus.task_1319;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][size];
        int k = 1;
        for (int j = size - 1; j > -size; j--) {
            int x, y;
            if (j > 0) {
                x = j;
                y = 0;
            }else {
                x = 0;
                y = -j;
            }
            for (int i = 0; i < size; i++) {
                try{
                    arr[y++][x++] = k;
                    k++;
                }
                catch(Exception e){
                    break;
                }
            }
        }
        for (int[] x: arr){
            for (int y: x) System.out.print(y + "\t");
            System.out.println();
        }
    }
}

