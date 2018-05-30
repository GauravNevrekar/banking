package banking;
import java.util.Scanner;
 


public class banking{
    
     /** 
      
     * This is a code for BASIC BANK OPERATIONS (WITHDRAW,DEPOSITE,DISPLAY BALANCE)
     *IN THIS PART OF CODE WE ARE TAKING INTO CONSIDERATION THE USERS CHOICE
     * HERE THE USER CAN DEPOSIT MONEY IN THE  BANK BY ENTERTING CHOICE AS 1
     * THE USER CAN WITHDRAW MONEY FROM THE BANK BY ENTERTING CHOICE AS 2
     *THE USER CAN CHECK HIS BANK BALANCE BY ENTERTING CHOICE AS 3
     * AFTER USER FINISHES WITH HIS /HER OPERATIONS HE CAN EXIT WITH CHOICE 4
 
     *INVALID CHOICE MESSAGE IS DISPLAYED WHEN CHOICE IS NOT APPROPRIATE
     * @param args 
     
      
      */  

    public static void main(String[] args) {

        float amount;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Enter initial deposit greater than 500:");
            amount = inp.nextFloat();
        } while (amount < 500);

        bank b1 = new bank(amount);
        Exit:
        while (true) {
            System.out.println("1.Deposit 2: Withdraw 3:Display Balance 4. Exit");
            System.out.println("Enter your choice:");
            int ch = inp.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter amt to be deposited:");
                    amount = inp.nextFloat();
                    b1.deposit(amount);
                    break;

                case 2:
                    System.out.println("Enter amt to be withdrawn:");
                    amount = inp.nextFloat();
                    b1.withdraw(amount);
                    break;

                case 3:
                    b1.display();
                    break;

                case 4:
                    break Exit;

                default:
                    System.out.println("Invalid chouce");
            }
        }
        

    }
}
