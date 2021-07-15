package day3;
import java.util.Scanner;
class Student2
{
int maths,physics,chemistry,total;
String name;
float pi=3.14f;
Student2()
{
float pi=4.14f;
Scanner sc= new Scanner(System.in);	
System.out.println(this.pi);
System.out.println(pi);
System.out.println("Enter maths mark");
this.maths=sc.nextInt();
System.out.println("Enter physics marks");
this.physics=sc.nextInt();
System.out.println("Enter the chemistry marks");
this.chemistry=sc.nextInt();
System.out.println("Enter the name of student");
this.name=sc.next();
}
Student2(int x,int y,int z,String n)
{
this.maths=x;
this.physics=y;
this.chemistry=z;
this.name=n;
}
void totalmarks()
{
total=maths+physics+chemistry;
}
void disptotal()
 {
System.out.println("Name of Student\t"+name);
System.out.println("Maths marks\t"+maths);
System.out.println("Physics marks\t"+physics);
System.out.println("Chemistry marks\t"+chemistry);
System.out.println("------------------------------------");
System.out.println("Total marks"+total);
 }
}
public class Marklist {
public static void main(String[] args) 
{
		Student2 prasad=new Student2();
		Student2 pradeep=new Student2(50,60,70,"pradeep");
		prasad.totalmarks();
		prasad.disptotal();
		pradeep.totalmarks();
		pradeep.disptotal();
		
	}

}
