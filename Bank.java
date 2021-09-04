import java.util.*;

class BankAccount {
    int initAmount;
    float interestRate;
    static float balance;

    static final Scanner sc = new Scanner(System.in);

    BankAccount(int amt, float rate) {
        this.initAmount = amt;
        this.interestRate = rate;
        balance += this.initAmount;
    }

    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposited successfully!!\nCurrent Balance : " + balance);
    }

    void withdraw(int amt) {
        if (amt > balance)
            System.out.println("Your account has insufficient balance !");
        else
            balance -= amt;
        System.out.println("Withdrawn successfully !\nAvailable balance :" + balance);

    }

    void interest() {
        float finall, years;
        System.out.print("Enter the time period : ");
        years = sc.nextFloat();

        this.interestRate = this.interestRate / 100;
        float result = (float) Math.pow((1 + this.interestRate / 12), 12 * years);
        finall = balance * result;
        System.out.println("Compound Interest : " + finall);
    }

    void checkBalance() {
        System.out.println("Your current balance is : " + balance);
    }

    void menu() {
        System.out.println("\n\t1.Deposit\n\t2.Withdraw\n\t3.Calculate Interest\n\t4.View Balance\n\t5.Return to main menu\n\t6.Exit");
    }
}

public class Bank {

    public static void main(String[] args) {
        int choice;
        int amt;
        float rate;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial amount: ");
        amt = sc.nextInt();
        System.out.print("Enter interest rate : ");
        rate = sc.nextFloat();
        BankAccount user = new BankAccount(amt, rate);
        System.out.println("Your Account has been initialized !!");
        user.menu();
        do {

            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be deposited : ");
                    amt = sc.nextInt();
                    user.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter the amount to be withdrawn : ");
                    amt = sc.nextInt();
                    user.withdraw(amt);
                    break;
                case 3:
                    user.interest();
                    break;
                case 4:
                    user.checkBalance();
                    break;
                case 5:
                    user.menu();
                    break;
                case 6:
                    System.out.println("EXIT !!");
                    break;
                default:
                    System.out.println("Invalid choice ! Please Enter the Valid Choice..!!!");
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}