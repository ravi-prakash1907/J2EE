package day6;

//Example of an abstract class that has abstract and non-abstract methods  
 abstract class Bike3{  
   Bike3(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike3{  
 void run(){System.out.println("running safely..");}  
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class abstract3{  
 public static void main(String args[]){  
  Bike3 obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}  
