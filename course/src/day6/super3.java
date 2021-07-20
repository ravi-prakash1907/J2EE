package day6;

class newAnimal{  
	newAnimal(){System.out.println("animal is created");}  
}  
class newDog extends newAnimal{  
newDog(){  
super();  
System.out.println("dog is created");  
}  
}  
class super3{  
public static void main(String args[]){  
newDog d=new newDog();  
}}  
