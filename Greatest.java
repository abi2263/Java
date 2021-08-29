import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first num:");
        a = s.nextInt();
        System.out.print("Enter the second num:");
        b = s.nextInt();
        System.out.print("Enter the third num:");
        c = s.nextInt();
        s.close();

        if (a > b && a > c) {
            System.out.println(a + " is greater.");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println(c + " is greater.");
        }
    }
}

/*
 * System.out.println(c>(a>b?a:b)?c:((a>b)?a:b));
 */
