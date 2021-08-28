import java.util.Scanner;

public class leapyr {

    public static void main(String[] args) {
        int n;
        Scanner l = new Scanner(System.in);
        System.out.print("Enter the year :");
        n = l.nextInt();
        l.close();

        if (n % 400 == 0)
            System.out.println(n + " is a leap year.");

        else if (n % 100 == 0)
            System.out.println(n + " is not a leap year.");

        else if (n % 4 == 0)
            System.out.println(n + " is a leap year.");

        else
            System.out.println(n + " is not a leap year.");
        
    }
}
