package lr9.indWork;

import java.sql.Time;
import java.util.ArrayList;
import java.util.LinkedList;

public class Example7 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 1; i <= 1000000; i++) {
            al.add(i);
            ll.add(i);
        }

        long startTime = System.currentTimeMillis();
        while (al.size() != 1){
            al.remove(1);
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList(ms) - " + endTime);

        startTime = System.currentTimeMillis();
        while (ll.size() != 1){
            ll.remove(1);
        }
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList(ms) - " + endTime);


    }
}
