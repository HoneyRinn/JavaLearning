package lr9.indWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(0, "qwer");
        hm.put(1, "qwek");
        hm.put(2, "string");
        hm.put(3, "smth");
        hm.put(4, "aaa");
        hm.put(5, "qweffkffrek");
        hm.put(6, "qwek");
        hm.put(7, "string");
        hm.put(8, "smth");
        hm.put(9, "aaa");

        Set<Map.Entry<Integer, String>> set = hm.entrySet();
        int n = 1;
        for(Map.Entry<Integer, String> me : set){
            if(me.getKey() == 0) System.out.println(me.getValue()+", ");
            String ref = me.getValue();
            if (ref.length() > 5) n *= me.getKey();
        }
        System.out.println("n = " + n);
    }
}
