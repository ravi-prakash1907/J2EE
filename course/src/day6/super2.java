package day6;

class newAnimal2{  
void eat(){System.out.println("eating...");}  
}  
class newDog2 extends newAnimal2{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class super2{  
public static void main(String args[]){  
	newDog2 d=new newDog2();  
d.work();  
}}  
