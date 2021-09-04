//Electricity bill generation
import java.util.*;

class Elec_bill {
	int cons_no, prev_read, curr_read, choice;
	double bill;
	String cons_name;
	
	Elec_bill(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Consumer name: ");
		cons_name = in.nextLine();
		System.out.print("Enter Consumer number: ");
		cons_no = in.nextInt();
		System.out.print("Enter previous units consumed: ");
		prev_read = in.nextInt();
		System.out.print("Enter Current units consumed: ");
		curr_read = in.nextInt();
	}

	double calc_bill() {
		System.out.println("\n\n\tTYPES OF BILL");
		System.out.print("     -------------------");
		System.out.print("\n\t 1.DOMESTIC\n\t 2.COMMERCIAL\n\t 3.EXIT\n\n");
		do {
			System.out.print("\nEnter the Choice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (curr_read >= 0 && curr_read <= 100)
					bill = curr_read * 1;

				else if (curr_read > 100 && curr_read <= 200)
					bill = (100 * 1) + ((curr_read - 100) * 2.50);

				else if (curr_read > 200 && curr_read <= 500)
					bill = (100 * 1) + (100 * 2.50) + ((curr_read - 200) * 4);

				else
					bill = (100 * 1) + (100 * 2.50) + (300 * 4) + ((curr_read - 500) * 6);
				System.out.print("Bill was generated!\nPress 3 to exit and get your bill.\n\n");
				break;


			case 2:
				if (curr_read >= 0 && curr_read <= 100)
					bill = curr_read * 2;

				else if (curr_read > 100 && curr_read <= 200)
					bill = (100 * 1) + ((curr_read - 100) * 4.50);

				else if (curr_read > 200 && curr_read <= 500)
					bill = (100 * 1) + (100 * 2.50) + ((curr_read - 200) * 6);
				else
					bill = (100 * 1) + (100 * 2.50) + (300 * 4) + ((curr_read - 500) * 7);
				System.out.print("Bill was calculated..!!\nPress 3 to exit and get your bill.\n\n");
				break;

			case 3:
				System.out.println("EXIT !\n");
				break;

			default:
				System.out.println("Please Enter the valid choice (1/2/3)");
				break;
			}
		} while (choice != 3);
		return 0;
	}

	void display() {
		System.out.println("----------------------------------");
		System.out.println("\tELECTRICITY BILL");
		System.out.println("----------------------------------");
		System.out.println("Consumer Number: " + cons_no);
		System.out.println("Consumer Name: " + cons_name);
		System.out.println("Consumer Previous Units: " + prev_read);
		System.out.println("Consumer Current Units: " + curr_read);
		System.out.println("----------------------------------");
		System.out.println("Total Amount(Rs.): " + bill);
	}
}

public class ElectricityBill {
	public static void main(String[] args) {
		Elec_bill b = new Elec_bill();
		b.calc_bill();
		b.display();
	}
}