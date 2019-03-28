import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double plat = 0;
		
		

		System.out.println("Package Deals: 1 for Economy, 2 for Compact, 3 for Standard ");

		System.out.print("Please choose the rental car: ");
		double cars = 0;
		int rental = input.nextInt();
		String carName;
		
		if (rental == 1) {
			cars = 35;
			carName = ("Economy");
		}
		else if (rental == 2) {
			cars = 45;
			carName = ("Compact");
		}
		else {
			cars = 95;
			carName = ("Standard");
		}

		System.out.print("Please enter the number of rental days: ");

		int days = input.nextInt ();

		System.out.println("Club Member?: 1 for yes, 0 for no: ");
		
		int club = input.nextInt();
		
		System.out.print("Platinum Executive Package?: 1 for yes, 0 for no:  "  );
		
		int value = input.nextInt();
			
			
		double discount = 0;
	
				
		
		if (club == 1 && value == 1) {
			int change = days/7;
			discount = change * cars;
			plat = (cars * days) * .15;
		}
		else if (club == 1 && value == 0) {
			int change = days/7;
			discount =  change * cars; 
			plat = 0;
		
		}else {
			discount = 0;
			plat = 0;
		}

		double base = days * cars;
		double total = base - discount + plat;
		
		System.out.println(" ");



		System.out.println("Base: " + days + "days for a " + carName + " @ $" + cars + " per day" + base);



		System.out.println("Club Member Discount:    - " + discount);



		System.out.println("Platinum Executive Package:    + " + plat);		



		System.out.println(" ");


		System.out.println("Total Estimate for Rental:    $" + total);




	}

}
