package day2;

import java.util.Scanner;

class student {
int maths,physics,chemistry,total;
	student() {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the maths mark");
		maths=sc.nextInt();
		System.out.println("Enter the physics mark");
		physics=sc.nextInt();
		System.out.println("Enter the chemistry mark");
		chemistry=sc.nextInt();
	}
	
	void totalmarks() {
	total=maths+physics+chemistry;
	}
	
	void dispmarks() {
	System.out.println("Total marks"+total);
	}
}
public class StudentMarks {
	public static void main(String[] args) {
		student lekshmi=new student();
		//lekshmi.readmarks();
		lekshmi.totalmarks();
		lekshmi.dispmarks();
	}
}		
