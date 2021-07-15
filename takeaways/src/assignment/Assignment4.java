/*
You are going to ATM.You are seeing the options
1.Balance Enquiry
2.Withdrawal
3.Deposit

you are having a balance of 10000
Write a program in switch case for the implementation of the above

Write the same program using if ..else if .....else
*/

package day4;

import java.util.Scanner;

class ATM {
    int balance;

    ATM(int bal = 10000) {
        this.balance = (float) bal;
    }

    // 1.Balance Enquiry
    float balEnquiry () {
        return this.balance;
    }

    // 2.Withdrawal
    void withdraw(float ammount) {
        if (this.balance >= ammount) {
            this.balance -= ammount;
            System.out.println("Successfuly withdrawal: "+ammount);
            System.out.println("Balance left: "+this.balEnquiry());
        }
    }

    // 3.Deposit
    void deposit(float ammount) {
        this.balance += ammount;
        System.out.println("Successfuly added: "+ammount);
        System.out.println("Current outstanding balance: "+this.balEnquiry());
    }

    boolean switchTell(int c) {
        switch()
    }

    // o/p
    public void dummyATM() {
        Scanner s = new Scanner(System.in);
        System.out.println("MENU\n------\n");
        System.out.println("1. Balance Enquiry \n2. Withdrawal \n3. Deposit \n*  Any other key to exit!\n");

        System.out.print("Your choice: ");
        int ch = s.nextInt();

        // switch logic
        this.switchTell(ch);
    }
}

public class Assignment4 {
    public stattic void main (String args[]) {

    }
}