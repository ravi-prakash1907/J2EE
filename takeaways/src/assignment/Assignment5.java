package assignment;

import java.util.Scanner;

public class Assignment5 {
	// WAP to count name (or any word) in a sentance and 
	// match with each word for its existance
	static void q1() {
		String str = "how are you lol";
		String[] s = str.split(" ");

		System.out.println(str.length());
		System.out.println(s.length);
		
		for(String st : s) {
			System.out.print(st+" : ");
		}
		
		// check for a word
		int nameCount = 0;
		String name = "lol";
		
		for(String st : s) {
			if(st.equalsIgnoreCase(name)) {
				System.out.println("Word '"+name+"' is present");
				nameCount++;
			}
			else {
				System.out.println("Word '"+name+"' is NOT present");
			}
		}
		System.out.println(name+" occured "+nameCount+" times.");
	}

	public static void main (String args[]) {
	    	Scanner s = new Scanner(System.in);
	    	
			//question 1
		q1();
		System.out.println("\n----------- PRESS A KEY ------------\n");
		s.nextLine();
        
    }

}
