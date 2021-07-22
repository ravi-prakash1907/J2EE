package day7;
import java.io.*;
import java.util.*;  

public class exceptions {
	
	public static void writeToFile() throws IOException {
		//BufferedWriter bw = new BufferedWriter(1024);
	}

	public static void main(String[] args) {
		
		// Arithmetic excp.
		int a = 9;
		int b = 0;
		
		try {
			int res = a/b; 
		} catch(ArithmeticException e) {
			System.out.println("b can not be 0");
		} finally {
			System.out.println("out");
		}
		
		
		// I/O excp.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter filename");
		String fileName = s.nextLine();
		
		try{
			FileInputStream fileInputStream = new FileInputStream(fileName);
			fileInputStream.read();
		} catch (IOException e) {System.out.println("File can't be opned!");}
		
		
		// File not found except
		try{
			FileInputStream fileInputStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {System.out.println("File is not found!");}
		
		
		/////////////////////////
		
		// throw keyword
		int val = 23;
		
		 if(val%2 != 0)  
		    throw new ArithmeticException("Not an even number!");  
		 else
		    System.out.println("Even number!"); 

	}

}
