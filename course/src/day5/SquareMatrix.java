package day5;

import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		int matrix[][];
		int row, column;
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("\nEnter number of rows and columns :");
		row=in.nextInt();
		column=in.nextInt();
		matrix = new int[row][column];
			
	 System.out.println("Enter the data for matrix :");
		for(int i=0; i<row; i++) 
	    {
			for(int j=0; j<column; j++)
			{
				matrix[i][j] = in.nextInt();
				}
			}
			
			System.out.println("\nThe Matrix is :");
			
			for(int i=0; i<row; i++) 
			{
				
				for(int j=0; j<column; j++) 
				{
					
					System.out.print("\t" + matrix[i][j]);
				}
				System.out.println();
			}
	}
}
