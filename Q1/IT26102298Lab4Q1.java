import java.util.Scanner;
public class IT26102298Lab4Q1{
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("The number is : possitive");
		}else if (num < 0) { 
		    System.out.println("The number is : negative");
		} else { 
			System.out.println("The number is : Zero");
		}
		sc.close();
	}
}