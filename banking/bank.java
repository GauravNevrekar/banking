/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class bank {
    
   public int deposit(int amount){
       int balance=2000;
       balance+=amount;
       return balance;
       
   }
   public int withdraw(int amount){
       int balance=2000;
       if(amount<500){
           System.out.println("insufficient");
           
       }
       else{
           balance-=amount;
           
       }
   
       return balance;
       
   }
   
   public int display(){
       int balance=2000;
       return balance;
   }
}
   
   
   
   
   
   
