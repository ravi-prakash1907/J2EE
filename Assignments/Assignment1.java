/**
 * Assignment-1
 */
import java.util.Scanner;
public class Assignment1 {
  
    // Write a program to print "My name is "-------
    public static void q1() { 
        String name = "Ravi Prakash";
        System.out.println("My name is " + name);
    }
  
    // Write a program to print "I am"----"year old"
    public static void q2() { 
        int age = 21;
        System.out.println("I am " + age + " years old");
    }
    
    public static void q3() { 

        int num1=0;
        int num2=0;
        
        Scanner s= new Scanner(System.in);
        
        System.out.printf("Enter first no: ");
        num1 = s.nextInt();
        System.out.printf("Enter second no: ");
        num2 = s.nextInt();
      
        System.out.println("");
        
        int sum = num1+num2;
        int diff = num1-num2;
        int prod = num1*num2;
      
        System.out.println("Sum = "+sum);
        System.out.println("Difference = "+diff);
        System.out.println("Product = "+prod);
        
        if (num2 == 0) {
          System.out.println("Division by Zero Error!!");
        }
        else {
          float div = (float) num1/(float) num2;
          System.out.println("Dividend = "+div);
        }   
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