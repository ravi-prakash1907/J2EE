package day5;

import java.util.Scanner;

import day4.loops;

public class inharitanceEg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("\n\nEnter the height of desired pyramid: ");
        int h = s.nextInt();
        loops.makePyramid(h);
        
        // loops.factorial(h); // not accessible as it is private
	}
}
