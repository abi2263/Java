import java.util.*;

class student {
    int n, i;
    String name[] = new String[50];
    int roll_number[] = new int[50];
    int age[] = new int[50];
    String sex[] = new String[50];
    float height[] = new float[50];
    float weight[] = new float[50];
    
    static final Scanner in = new Scanner(System.in);

    void getdata() {
        System.out.print("Enter the number of students you would like to get data: ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {    
            System.out.print("\nEnter the Student " + i + " Roll Number: ");
            roll_number[i] = in.nextInt();
            System.out.print("Enter the Student " + i + " Name: ");
            name[i] = in.next();
            System.out.print("Enter the Student " + i + " Age: ");
            age[i] = in.nextInt();
            System.out.print("Enter the Student " + i + " Sex: ");
            sex[i] = in.next();
            System.out.print("Enter the Student " + i + " Height: ");
            height[i] = in.nextFloat();
            System.out.print("Enter the Student " + i + " Weight: ");
            weight[i] = in.nextFloat();
        }
    }

    void display() {
        System.out.println("\n\tSTUDENT DETAILS");
        for (i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i + " Roll Number: " + roll_number[i]);
            System.out.println("Student " + i + " Name: " + name[i]);
            System.out.println("Student " + i + " Age: " + age[i]);
            System.out.println("Student " + i + " Sex: " + sex[i]);
            System.out.println("Student " + i + " Height: " + height[i]);
            System.out.println("Student " + i + " Weight: " + weight[i]);
        }
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        student s = new student();
        s.getdata();
        s.display();
    }
}
