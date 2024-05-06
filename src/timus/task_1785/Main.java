package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if(size > 1 && size <= 4) System.out.println("few");
        else if(size > 4 && size <= 9) System.out.println("several");
        else if(size > 9 && size <= 19) System.out.println("pack");
        else if(size > 19 && size <= 49) System.out.println("lots");
        else if(size > 49 && size <= 99) System.out.println("horde");
        else if(size > 99 && size <= 249) System.out.println("throng");
        else if(size > 249 && size <= 499) System.out.println("swarm");
        else if(size > 499 && size <= 999) System.out.println("zounds");
        else System.out.println("legion");
    }
}
