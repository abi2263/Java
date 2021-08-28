import java.util.Scanner;

public class posneg {
    public static void main(String[] args) {
        int n;
        Scanner pn = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = pn.nextInt();
        pn.close();

        if (n >= 0) {
            System.out.println(n + " is positive number.");
        } else {
            System.out.println(n + " is negative number.");
        }
    }
}
