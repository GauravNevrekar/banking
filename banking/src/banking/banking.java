package banking;
import java.util.Scanner;
class bank{
    float balance;
    bank(float amount) {
    balance=amount;
}
       void deposit(float amount) {
        balance += amount;
    }
       void newacc(){
           

}
       

    void withdraw(float amount) {
        if (amount < 500) {
            System.out.println("Insufficient bal");
        } else {
            balance -= amount;
        }
    }

    void display() {
        System.out.println("Balance is:" + balance);
    }
}


public class banking{

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
