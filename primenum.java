import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        int i;
        Scanner p = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = p.nextInt();
        p.close();
        for (i = 2; i <= n; i++) {
            if ((n % i) == 0)
                break;
        }
        System.out.println((i == n) ? (n + " is Prime.") : (n + " is not a prime."));
    }
}