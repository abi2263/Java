import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first num:");
        a = s.nextInt();
        System.out.print("Enter the second num:");
        b = s.nextInt();
        c = a + b;
        System.out.print("Result:" + c);
        s.close();
    }
}
