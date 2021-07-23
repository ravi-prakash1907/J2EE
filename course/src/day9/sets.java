// set can't consist duplicate elements

/*
3 types of set:
1) hashset
2) linked hash sets
3) treeset


have almost same syntax as that of arraylist, linkedlist...
*/


package day9;

import java.util.*;


class hashSetEg {
    public void applyThis() {
        Hashset<String> s = new Hashset();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
} 

class linkedHashSetEg {
    public void applyThis() {
        LinkedHashset<String> s = new LinkedHashset();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
} 

class treeSetEg {
    public void applyThis() {
        Treeset<String> s = new Treeset();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        Iterator<String> i = set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
} 


class arrList {
    public static void main(String[] args) {

        hashSetEg hs = new hashSetEg()
        hs.applyThis()

        ////////////////////////////
        
        linkedHashSetEg lhs = new linkedHashSetEg()
        lhs.applyThis()

        ////////////////////////////
        
        treeSetEg ts = new treeSetEg()
        ts.applyThis()
    }
}

