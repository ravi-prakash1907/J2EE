package day6;

abstract class Bank2{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank2{    
int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank2{    
int getRateOfInterest(){return 8;}    
}    
    
class abstract2TestBank{    
public static void main(String args[]){    
Bank2 b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new PNB();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}}    
