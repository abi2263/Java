import java.util.*;

class EmployeeDetails{
    double hra,da,cca,ded,tot;

    EmployeeDetails(double bp){
        hra=1.5*bp;
        da=1.2*bp;
        cca=1.3*bp;
        ded=bp-2000;
        tot=hra+da+cca-ded;
    }

    void printDetails(String Name,int Id,String Des,String joinDate,double AccNo,double basicpay){
        System.out.println("\n\tEMPLOYEE DETAILS AND SALARY\n");
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee ID: "+Id);
        System.out.println("Employee Designation: "+Des);
        System.out.println("Employee Joining date: "+joinDate);
        System.out.println("Employee Account Number: "+AccNo);
        System.out.println("Employee's Basic Pay: "+basicpay);
        System.out.println("TOTAL SALARY: "+tot);
        
    }
} 
public class Employee {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Employee name: ");
        String name=in.next();
        System.out.print("Enter the Employee ID: ");
        int id=in.nextInt();
        System.out.print("Enter the Employee Designation: ");
        String des=in.next();
        System.out.print("Enter the Employee joining date: ");
        String joindate=in.next();
        System.out.print("Enter the Employee Account Number: ");
        double acc_no=in.nextDouble();
        System.out.print("Enter the Employee Basic pay: ");
        double basicPay=in.nextDouble();
        EmployeeDetails e=new EmployeeDetails(basicPay);
        e.printDetails(name,id,des,joindate,acc_no,basicPay);
        in.close();
    }
}
