package timus.task_1585;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] array = new String[size];
        array[0] = in.nextLine();
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextLine();
        }
        int countA= 0;
        int countB= 0;
        int countC= 0;
        for(String x: array){
            switch (x){
                case ("Emperor Penguin"):
                    countA++;
                    break;
                case ("Little Penguin"):
                    countB++;
                    break;
                case ("Macaroni Penguin"):
                    countC++;
                    break;
            }
        }
        if(countA > countB && countA > countC) System.out.println("Emperor Penguin");
        else if (countB > countC) System.out.println("Little Penguin");
        else System.out.println("Macaroni Penguin");

    }
}
