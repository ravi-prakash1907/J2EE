package day5;

public class bufferStr {
	
	public static void main (String[] args) {
		// str buffer
		StringBuffer sbf1 = new StringBuffer("I am God");
		StringBuffer sbf2 = new StringBuffer(1024);
		
		int a = sbf1.length();
		int b = sbf1.capacity();
		System.out.println("Length: "+a);
		System.out.println("Capacity: "+b);
		
		System.out.println();
		
		int x = sbf2.length();
		int y = sbf2.capacity();
		System.out.println("Length: "+x);
		System.out.println("Capacity: "+y);
	}
}
