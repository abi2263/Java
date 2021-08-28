import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the numbers (with using spaces): ");
        String[] numbers = s.nextLine().split(" ");
        s.close();

        for (int i = 0; i < numbers.length; i++) {
            int sum = 0, num, digit;
            num = Integer.parseInt(numbers[i]);

            while (num > 0) {
                digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            System.out.println("Sum of digits in a numbers:" + sum);
        }
    }
}