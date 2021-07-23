/*
3 types of map:
1) has map
2) linked hash map
3) tree map
*/

package day9;

import java.util.*;

public class treeMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"mango");
        map.put(2,"apple");
        map.put(3,"keys");
        
        System.out.println("Iteraging aps: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+", "+m.getValue());
        }
        //
    }
}


public class maps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"mango");
        map.put(2,"apple");
        map.put(3,"keys");
        
        System.out.println("Iteraging aps: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+", "+m.getValue());
        }
        //
    }
}
