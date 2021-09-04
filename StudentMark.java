import java.util.*;

class Stu_{
    void calcfail(String[] name, int[] mark, int total) {
        String[] fail = new String[total];
        String[] pass = new String[total];
        int failCount =0 ,passCount=0;
        for (int i = 0; i < total; i++) {
            if (mark[i] < 40) 
                fail[failCount++] = name[i];
            else 
                pass[passCount++] = name[i];  
        }
        System.out.print("\nFailed students:");
        for (int i = 0; i < failCount; i++) 
                System.out.print(fail[i]+" ");
     
        System.out.print("\nPassed students:");
        for (int i = 0; i < passCount; i++) 
                System.out.println(pass[i]+" ");
   
        

    }
}

public class StudentMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[20];
        int[] mark = new int[20];
        System.out.print("No.of students: ");
        int total = sc.nextInt();
        System.out.println("Enter the names and marks of the students!");
        for (int i = 0; i < total; i++) {
            System.out.print("\nEnter name: ");
            name[i] = sc.next();
            System.out.print("Enter marks: ");
            mark[i] = sc.nextInt();    
        }
        sc.close();
        Stu_ s=new Stu_();
        s.calcfail(name, mark, total);
        System.out.println("\nDone!");
    }

}
