import java.util.Scanner;

public class IT26102459Lab4Q1{
	public static void main (String[]args){
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int Number = input.nextInt();
		
		if(Number > 0) {
			System.out.println("The Number is Positive");
			
		} else if (Number < 0) {
			System.out.println("The Number is Negative");
			
		} else {
			System.out.println("The Number is Zero");
		}
		
		
	}
}
