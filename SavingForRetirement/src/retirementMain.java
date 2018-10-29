import java.util.Scanner;

public class retirementMain {
	private static Scanner input;
	private static Scanner input2;
	private static double interest;

	public static void main(String[] args) {
		
		System.out.printf("You will have saved $%4.2f", equation(getYears(), getMoney()));
	}

	/** Method for getting number of years until retirement */
	static int getYears() {
		
		input = new Scanner(System.in);
		System.out.println("Enter how many years you have left until retirement: ");		
		int years = input.nextInt();
		return years;	
	}
	
	/** Method for getting annual money that can be saved */
	static double getMoney() {
		
		input2 = new Scanner(System.in);
		System.out.println("Enter how much money you can save annually ");
		double money = input2.nextDouble();
		return money;	
	}
	
	static double equation(int years, double money) {
		
	final double RATE = 0.05;
	setInterest((RATE * (years * money) + (years * money)));
	double saved = years * money;
	return saved;
	}


	public static double getInterest() {
		return interest;
	}


	public static void setInterest(double interest) {
		retirementMain.interest = interest;
	}

}