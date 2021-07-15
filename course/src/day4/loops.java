package day4;

import java.util.*;

public class loops {

    void makePyramid(int height) {
        for(int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    int factorial(int num) {
        if (num >= 0) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static void main (String args[]) {

        int res, num = 1;

        // while loop
        num++; 

        int i=1;
        while(i<=10) {
            res = num*i;
            System.out.println("2 x "+i+" =  "+res);
        }

        System.out.println("");

        // do-while loop
        num++;

        int j=1;
        do {
            res = num*j;
            System.out.println("2 x "+j+" =  "+res);
        } while(i<11);

        System.out.println("");

        // for loop
        num++;

        for (int k = 1; k < 11; k++) {
            res = num*k;
            System.out.println("2 x "+k+" =  "+res);
        }

        System.out.println("\n---------------------------\n");
        ///////////////////////

        Scanner s = new Scanner(System.in);
        System.out.print("\n\nEnter the height of desired pyramid: ")
        int h = s.nextInt();
        this.pyramid(h);
        
        ///////////////////////

        System.out.println("\n\n"+h+"! = "+this.factorial(h));
    }
}