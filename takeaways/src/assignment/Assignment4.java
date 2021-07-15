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
        } else {
            System.out.println("You do not have funds!!");
        }
    }

    // 3.Deposit
    void deposit(float ammount) {
        this.balance += ammount;
        System.out.println("Successfuly added: "+ammount);
        System.out.println("Current outstanding balance: "+this.balEnquiry());
    }

    boolean switchTell(int c) {
        Scanner s = new Scanner(System.in);
        switch(c) {
            case 1:  System.out.println("Current outstanding balance: "+this.balEnquiry());
                     break;
            case 2:  System.out.printf("Enter amount to withdraw: ");
                     int w = s.nextFloat();
                     this.withdraw(w);
                     break;
            case 3:  System.out.printf("Enter amount to deposit: ");
                     int d = s.nextFloat();
                     this.deposit(d);
                     break;
            default: System.out.println("Thankyou for visiting ATM!!");
                     return false;
        }
        
        return true;
    }

    boolean ifELTell(int c) {
        Scanner s = new Scanner(System.in);

        if (c == 1) {
            System.out.println("Current outstanding balance: "+this.balEnquiry());
        } else if(c == 2) {
            System.out.printf("Enter amount to withdraw: ");
            int w = s.nextFloat();
            this.withdraw(w);
        } else if(c== 3) {
            System.out.printf("Enter amount to deposit: ");
            int d = s.nextFloat();
            this.deposit(d);
        } else {
            default: System.out.println("Thankyou for visiting ATM!!");
            return false;
        }
        
        return true;
    }

    // o/p
    public void dummyATM(int using) {
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("MENU\n------\n");
            System.out.println("1. Balance Enquiry \n2. Withdrawal \n3. Deposit \n*  Any other key to exit!\n");

            System.out.print("Your choice: ");
            int ch = s.nextInt();

            
            if (using==1)
                askAgain = this.switchTell(ch);  // switch logic
            else
                askAgain = this.ifELTell(ch);   // if-else logic
        } while(askAgain);
    }
}

public class Assignment4 {

    /*
    You are going to ATM.You are seeing the options
    1.Balance Enquiry
    2.Withdrawal
    3.Deposit

    you are having a balance of 10000
    Write a program in switch case for the implementation of the above

    Write the same program using if ..else if .....else
    */
    static void q1() {
        Scanner s = new Scanner(System.in);
        ATM myATM = new ATM();

        System.out.print("Enter 1 to use Switch and 2 to use If-Else logic: ");
        int log = s.nextInt(System.in);

        myATM.dummyATM(log);
    }

    // main
    public static void main (String args[]) {
        
		//question 1
        q1();
        System.out.println("\n----------- PRESS A KEY ------------\n");
        s.nextLine();
        
    }
}