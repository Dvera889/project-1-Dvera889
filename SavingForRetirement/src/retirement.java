import java.util.Scanner;
public class retirement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double RATE = 0.05;
		
		System.out.println("Enter how many years you have left until retirement: ");		
		int years = input.nextInt();

		while (years <= 0) {
			System.out.println("Invalid, please enter how many years you have left until retirement: ");
			years = input.nextInt();
		}
		
		System.out.println("Enter how much money you can save annually ");
		double money = input.nextDouble();
		
		double interest = (RATE * (years * money) + (years * money));
		double saved = years * money;
		
		System.out.printf("You will have saved $%4.2f", interest);
		
	}
}
