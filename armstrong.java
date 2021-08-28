import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        int n, num, rem, res = 0;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = a.nextInt();
        num = n;
        a.close();

        while (n > 0) {
            rem = n % 10;
            res += rem * rem * rem;
            n /= 10;
        }

        if (num == res) {
            System.out.print(num + " is an Armstrong number.");
        } else {
            System.out.print(num + " is not an Armstrong number.");
        }
    }
}
