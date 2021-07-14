package assignment;

import java.util.Scanner;

public class Assignment3 {

	// You are buying 3 items from a shop
	// Write a program to print the bill with name of item and
	// amount and total amount
	static class marketing {
		String item1,item2,item3;
		float priceI1,priceI2,priceI3;

		marketing(String i1,float p1,String i2,float p2,String i3,float p3){
			this.item1 = i1;
			this.priceI1 = p1;
			this.item2 = i2;
			this.priceI2 = p2;
			this.item3 = i3;
			this.priceI3 = p3;
		}
		
		// setters
		void setItem1(String name, float cost) {
			this.item1 = name;
			this.priceI1 = cost;
		}
		void setItem2(String name, float cost) {
			this.item2 = name;
			this.priceI2 = cost;
		}
		void setItem3(String name, float cost) {
			this.item3 = name;
			this.priceI3 = cost;
		}
		
		float aggrBill() {
			float total = this.priceI1 + this.priceI2 + this.priceI3;
			return total;
		}
		
		// item printer
		void printItem1() {
			String name = this.item1;
			float cost = this.priceI1;

			System.out.println("Item: "+name+"  |  "+"Price: "+cost);
		}
		void printItem2() {
			String name = this.item2;
			float cost = this.priceI2;

			System.out.println("Item: "+name+"  |  "+"Price: "+cost);
		}
		void printItem3() {
			String name = this.item3;
			float cost = this.priceI3;

			System.out.println("Item: "+name+"  |  "+"Price: "+cost);
		}
		
		public void printBill() {
			System.out.println("Your Bill:\n");
			this.printItem1();
			this.printItem2();
			this.printItem3();
			System.out.println("");
			System.out.println("Total bill amount: "+this.aggrBill());
		}
	}
		
    public static void q1() {
        float p = 20.34f;
        marketing m1 = new marketing("Milk" , p, "Milk" ,p, "Milk", p);
        m1.printBill();
    }
  
    // An Employee's salary is as follows
    // He has basic salary
    // he gets Rs.1000 as bonus
    // 10% of basic as da
    // Total the above
    // 30% of total salary is tax
    // Write a program to print the salary slip
    static class salary {
    	float basic, da, tax, bonus, total;
    	
    	salary(float b) {
    		this.bonus = 1000.00f;
    		this.basic = b;
    	}
    	
    	// setters
    	void setDA() {
    		this.da = (float) 0.1*this.basic; // (10% of basic)
    	}	
    	void totalSalary() {
    		this.total = basic + da + bonus; // (10% of basic)
    	}
    	void setTax() {
    		this.tax = (float) 0.3*this.total; // (10% of basic)
    	}
    	
    	public void setAll() {
    		this.setDA();
    		this.totalSalary();
    		this.setTax();
    	}
    	
    	// getters
    	float getDA() {
    		return this.da;
    	}
    	float getBasic() {
    		return this.basic;
    	}
    	float getBonus() {
    		return this.bonus;
    	}
    	float getTotal() {
    		return this.total;
    	}
    	float getTax() {
    		return this.tax;
    	}
    	
    	// finals
    	float finalSalary() {
    		// after deduction of tax
    		return this.getTotal()-this.getTax();
    	}
    	
    	// output
    	public void printSlip() {
    		System.out.println("\nSalary Slip\n");

    		System.out.println("Basic: "+this.getBasic());
    		System.out.println("Bonus: "+this.getBonus());
    		System.out.println("DA: "+this.getDA());
    		
    		System.out.println("\nTotal Marks: "+this.getTotal());
    		System.out.println("Tax Amount: "+this.getTax());
    		
    		System.out.println("\nFinal Salary (after paying the tax): "+this.finalSalary());
    	}
    }
    public static void q2() { 
    	Scanner s = new Scanner(System.in);
    	
    	System.out.printf("Enter your basic salary: ");
    	float bSal = s.nextFloat();
    	
    	salary newSal = new salary(bSal);
    	newSal.setAll();
    	newSal.printSlip();
    }
    
    // Write a Program using Constructor and OOPs for reading 2 nos.
    // perform addition, difference, multiplication, division
    static class calc {
    	int num1,num2;

    	calc () {
    		this.num1 = 0;
    		this.num2 = 0;
    	}    	
    	calc (int n1, int n2) {
    		this.num1 = n1;
    		this.num2 = n2;
    	}
    	
    	int add () {
    		return this.num1+this.num2;
    	}
    	
    	int sub () {
    		return this.num1-this.num2;
    	}
    	
    	int mul () {
    		return this.num1*this.num2;
    	}
    	
    	float div () {
    		return (float) this.num1/(float) this.num2;
    	}
    	
    	///
    	public void Calculations() {
    		System.out.println("Calculations\n");
    		
    		System.out.println("Sum: "+this.add());
    		System.out.println("Difference: "+this.sub());
    		System.out.println("Product: "+this.mul());
    		
    		
    		if (this.num2 == 0) {
    			System.out.println("Division by Zero Error!!");
    		}
    	    else {
    	    	System.out.println("Division: "+this.div());
    	    }
    	}
    	
    }
    public static void q3() {
    	calc cl = new calc(23,72);
    	cl.Calculations();
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//question 1
        q1();
        System.out.println("\n----------- PRESS A KEY ------------\n");
        s.nextLine();
        //question 2
        q2();
        System.out.println("\n----------- PRESS A KEY ------------\n");
        s.nextLine();
        q3();
        
	}

}
