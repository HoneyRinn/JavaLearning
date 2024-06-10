package timus.task_1639;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextByte();
        int n = in.nextByte();
        int result = ((m-1)+(n-1)*m);
        if(result%2==1){
            System.out.print("[:=[first]");
        }
        else{
            System.out.print("[second]=:]");
        }
    }
}
