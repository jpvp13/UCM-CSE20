import java.util.Scanner;


public class InterviewLab4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		String name;
		System.out.println("What is your full name?");
		name= input.next();
		System.out.print("Their name is ");
		System.out.println(name);
		
		
		Scanner month = new Scanner(System.in);
		String birthmonth;
		System.out.println("What month were you born in?");
		birthmonth = month.next();		
		System.out.print("They were born in ");
		System.out.println(birthmonth);		
				
		
		Scanner oldAge= new Scanner(System.in);
		String Age;
		System.out.println("How old are you?");
		Age=oldAge.next();
		System.out.println("They are " + Age + " years old");
		
		
		Scanner major =new Scanner(System.in);
		major.useDelimiter(System.getProperty("line.separator"));
		String Major;
		System.out.println("Whats your major?");
		Major=major.next();
		System.out.println("Their major is "+ Major);
		
		
		Scanner favFood= new Scanner(System.in);
		favFood.useDelimiter(System.getProperty("line.separator"));
		String Food;
		System.out.println("Whats your favorite food?");
		Food= favFood.next();
		System.out.println("Their favorite food is " + Food);
		
		
		System.out.println("What is your weight?");
		int weight = input.nextInt();
		System.out.println("Your weight is " + (float)weight / 2.2 + " in kg.");
		
				
	}

}
