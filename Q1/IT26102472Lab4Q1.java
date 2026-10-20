import java.util.Scanner;

public class IT26102472Lab4Q1{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		double number = input.nextDouble();
		
		if (number < 0){
			System.out.println("The number is Positive");
		}
		else if (number > 0){
			System.out.println("The number is Negative");
		}
		else if (number == 0){
			System.out.println("Zero");
		}
	}
}