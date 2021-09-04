import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n, fact = 1;
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = f.nextInt();
        f.close();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("The Factorial of " + n + " is " + fact);
    }
}
