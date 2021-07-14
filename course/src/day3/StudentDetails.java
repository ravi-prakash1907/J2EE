package day3;

import java.util.*;

class Student {
	int physics, chemistry, maths, total;
	String Name;

	// constructor
	Student() {
		this.physics = 0;
		this.chemistry = 0;
		this.maths = 0;
		
		this.Name = "Tao";
		this.setTotal();
	}
	
	Student(int p, int c, int m, String n) {
		this.physics = p;
		this.chemistry = c;
		this.maths = m;
		
		this.Name = n;
		this.setTotal();
	}
	
	// setters
	public void setName(String n) {
		this.Name = n;
	}
	public void setPhysics(int p) {
		this.physics = p;
	}
	public void setChemistry(int c) {
		this.chemistry = c;
	}
	public void setMaths(int m) {
		this.maths = m;
	}
	public void setTotal() {
		this.total = this.getPhysics() + this.getChemistry() + this.getMaths();
	}
	
	// getters
	String getName() {
		return this.Name;
	}
	int getPhysics() {
		//Scanner userInput = new Scanner(System.in);
		return this.physics;
	}
	int getChemistry() {
		return this.chemistry;
	}
	int getMaths() {
		return this.maths;
	}
	int getTotal() {
		return this.total;
	}
	
	// Output
	public void display() {
		System.out.println("Student details:\n");

		System.out.println("Name: "+this.getName());
		System.out.println("Marks in Physics: "+this.getPhysics());
		System.out.println("Marks in : "+this.getChemistry());
		System.out.println("Marks in : "+this.getMaths());
		System.out.println("Total Marks : "+this.getTotal());
		
	}
}

public class StudentDetails {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Default Students\n");
		Student myFirstStudent = new Student();
		myFirstStudent.display();		
		
		System.out.println("\n\n-------------------\n");

		System.out.printf("Enter student's name: ");
		String name = userInput.nextLine();
		System.out.printf("Marks scored in Physics: ");
		int pMarks = userInput.nextInt();
		System.out.printf("Marks scored in Chemistry: ");
		int cMarks = userInput.nextInt();
		System.out.printf("Marks scored in Maths: ");
		int mMarks = userInput.nextInt();
		
		System.out.println("\n");

		System.out.println("Parameterized Students\n");
		Student mySecondStudent = new Student(pMarks,cMarks,mMarks,name);
		mySecondStudent.display();
	}

}