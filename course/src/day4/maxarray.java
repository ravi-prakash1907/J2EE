package day4;

import java.util.Scanner;

public class maxarray {

    static void jumps () {
        System.out.println("Prints only odd numbers from 23 \ntill the first multiple of 20!\n");
        int beg = 22;
        while (true) {
        	beg++;
        	
            if (beg%20 == 0)
                break;
            
            if (beg%2 == 0)
                continue;

            System.out.println(beg);
            
        }
    }

    static void multiDMat() {
        int mat[][];
        int row, col;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and cols: ");
        row = s.nextInt();
        col = s.nextInt();
        
        mat = new int[row][col];

        System.out.println("Input the matrix: ");
        // input row x col matrix
        for (int i=0; i<row; i++) {
        	for (int j=0; j<col;j++) {
        		mat[i][j] = s.nextInt();
        	}
        }

        System.out.println("\n\nYour matrix: ");
        // display matrix
        for (int i=0; i<row; i++) {
        	for (int j=0; j<col;j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println("");
        }

    }

    public static void main (String args[]) {
        int[] arr = {10,20,30,40,50,60};
        int max = arr[0];
        for(int i=1;i<arr.length; i++) {
            max = arr[i]>max ? arr[i] : max;
        }

        System.out.println("Max. value = "+max);

        //////////////
        // 2-D mat
        multiDMat();

        //////////////
        // 2-D mat
        jumps();
    }
}