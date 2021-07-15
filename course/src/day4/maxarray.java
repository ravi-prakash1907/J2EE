package day4;

import java.util.Scanner;

public class maxarray {

    static void jumps () {
        System.out.println("Prints only odd numbers from 23 \ntill the first multiple of 20!\n");
        beg = 23;
        while (true) {
            if (beg%20 == 0)
                break;
            
            if (beg%2 == 0)
                goto inc;

            System.out.println(beg);

            inc:
            beg++;
        }
    }

    static void multiDMat() {
        int mat[][];
        int row, col;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows and cols: ")
        row = nextInt();
        col = nextInt();
        
        mat = new int[row][col];
        // input rowxcol matrix

        // display matrix

    }

    public static void main (String args[]) {
        int[] arr = {10,20,30,40,50,60};
        boolean b = false;
        max = arr[0];
        for(int i=1;i<arr.length; i++) {
            max = arr[i]>max ? arr[i] : max;
        }

        System.out.println("Max. value = "+max);

        //////////////
        // 2-D mat
        this.multiDMat();

        //////////////
        // 2-D mat
        this.jumps();
    }
}