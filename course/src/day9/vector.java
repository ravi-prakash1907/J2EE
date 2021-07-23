/* vector is a thread safe collection class
It'll not get affected by threads

have almost same syntax as that of arraylist, linkedlist...
*/

package day9;

import java.util.*;

public class vector {
    public static void main(String args[]) {  
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          //Adding elements using add() method of List  
          vec.add("Tiger");  
          vec.add("Lion");  
          vec.add("Dog");  
          vec.add("Elephant");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("Rat");  
          vec.addElement("Cat");  
          vec.addElement("Deer");  
            
          System.out.println("Elements are: "+vec);  
       }  
}