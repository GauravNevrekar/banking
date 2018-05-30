/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author User
 */
public class bank{
    float balance;
    bank(float amount) {
    balance=amount;
}
    /** 
     * THIS PART OF CODE HELPS TO DEPOSITE AMOUNT IN THE BANK
     * @param amount is the amount to be deposited in the bank
     */
       public void deposit(float amount) {
        balance += amount;
    }
        /** 
      *CODE TO WITHDRAW MONEY FROM THE BANK
      * THE WITHDRAWAL CAN BE DONE ONLY WHEN THE BALANCE IS GREATER THAN 500
      @param amount is the amount to be withdrawed from the bank*/ 

   public void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }
/**
 * THIS PART OF CODE DISPLAYS THE CURRENT BALANCE IN THE BANK
 */
 public   void display() {
        System.out.println("Balance is:" + balance);
    }
}
