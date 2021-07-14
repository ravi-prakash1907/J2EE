package assignment;

/**
 * Assignment-2
 */
import java.util.Scanner;
public class Assignment2 {
  
    // WAP to display the various data types available in Java and their respective size.
    public static void q1() { 
        System.out.println("//  INTEGERS  //");
        System.out.println("byte size : 1 byte (-ve & +ve)");
        System.out.println("short size : 2 bytes (-ve & +ve)");
        System.out.println("int size : 4 bytes (-ve & +ve)");
        System.out.println("long size : 4 bytes (-ve & +ve)");
        System.out.println("");

        System.out.println("//  FLOATING + DOUBLE  //");
        System.out.println("float size : 4 bytes");
        System.out.println("double size : 8 bytes");
        System.out.println("");

        System.out.println("//  BOOLEAN  //");
        System.out.println("boolean size : 1 bit");
        System.out.println("");

        System.out.println("//  CHAR  //");
        System.out.println("char size : 2 bytes");
    }
  
    // WAP to demonstrate the use of the different type of literals defined in Java.
    public static void q2() { 
        //  INTEGERS  //
        byte a = 2;  //size: 1 byte (-ve & +ve)
        short b = 156;  //size: 2 bytes (-ve & +ve)
        int c = 32769;  //size: 4 bytes (-ve & +ve)
        ///////////
        long l = 24678822;  //size: 8 bytes (-ve & +ve)

        //  FLOATING + DOUBLE  //
        float flt = 56.89f;  //size: 4 bytes
        double dbl = 4.54877;  //size: 8 bytes 

        //  BOOLEAN  //
        boolean codeInDay = false; //size: 1 bit
        boolean codeInNight = true; //size: 1 bit

        //  CHAR  //
        char ch = 'R'; //size: 2 bytes

        //  Outputs  //
        System.out.println("//  INTEGERS  //");
        System.out.println("byte a = "+a);
        System.out.println("short b = "+b);
        System.out.println("int c = "+c);
        System.out.println("long l = "+l);
        System.out.println("");

        System.out.println("//  FLOATING + DOUBLE  //");
        System.out.println("float flt = "+flt);
        System.out.println("doubl dbl = "+dbl);
        System.out.println("");

        System.out.println("//  BOOLEAN  //");
        System.out.println("boolean codeInDay = "+codeInDay);
        System.out.println("boolean codeInNight = "+codeInNight);
        System.out.println("codeInDay == codeInNight : "+(codeInDay ==  codeInNight));
        System.out.println("");

        System.out.println("//  CHAR  //");
        System.out.println("char ch = "+ch);
    }
    
    // WAP to demonstrate dynamic initialization of variables
    static class person { 
        private int age;

        public person (int years) {
            this.age = years;
        }

        public int getAge(){
            return this.age;
        }
    }

    public static void q3() { 

        Scanner s= new Scanner(System.in);

        System.out.printf("Enter your age (in years only): ");
        int age = s.nextInt();

        System.out.println("");
        
        person randomGuy = new person(age);  // 'age' dynamically initialized
      
        System.out.println("Your are "+randomGuy.getAge()+" years' old!");
    }

    public static void main(String args[]) { 

        //question 1
        q1();
        System.out.println("\n-------------------\n");
        //question 2
        q2();
        System.out.println("\n-------------------\n");
        //question 3
        q3();
    }
}
