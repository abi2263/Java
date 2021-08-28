import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        int n;
        Scanner oe = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = oe.nextInt();
        oe.close();

        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }
}
