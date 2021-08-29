import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n;
        Scanner f = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = f.nextInt();
        f.close();
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
