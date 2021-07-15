package day4;

import java.util.*;

class Conditionals {
	// Attributes
	int a = 12;
	int b = 20;

	// if-else
	void checkForA() {
		if (this.a < 10) {
			System.out.println("Less than 10");
		}
		else if (this.a > 10) {
			System.out.println("Greater than 10");
		} else {
			System.out.println("Equal to 10");
		}
	}

	void compare() {
		if (this.a < this.b) {
			System.out.println(this.a+" less than "+this.b);
		}
		else if (this.a > this.b) {
			System.out.println(this.a+" greater than "+this.b);
		} else {
			System.out.println(this.a+" equals to "+this.b);
		}
	}
    /*
	void ternaryOP() {
		int num = 7;
		String stmt = if (num == 7) ? "num is 7" : "num is not 7";
		System.out.println(stmt);
	}
	*/
	// switch

	// constructor(s)
	
	
	// setters
	
	
	// getters
	
	
	// Output
	public void opFun() {
		System.out.println("\n");
		this.checkForA();
		
		System.out.println("\n");
		this.compare();
		
		System.out.println("\n");
		//this.ternaryOP();		
		
		/////////////

		//System.out.println("\n");
		//this.ternaryOP();		
	}
}

public class Logicals {

	public static void main(String[] args) {
		// TODO workflow
		Conditionals c = new Conditionals();
		c.opFun();
	}

}
