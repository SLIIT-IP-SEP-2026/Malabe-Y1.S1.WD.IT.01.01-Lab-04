import java.util.Scanner;
public class IT261012540Lab4Q1{
	public static void maian(String[]args){
		int number;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number");
		number = input.nextInt();
		
		result = (number > 0) ?" The number is: Positive":
		          (number < 0) ?" The number is: Negative":
				  "The number is: Zero";
	System.out.println(result);				  	
	}
}	