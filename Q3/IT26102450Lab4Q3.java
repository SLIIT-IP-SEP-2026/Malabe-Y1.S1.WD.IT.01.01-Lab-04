import java.util.Scanner;
	public class IT26102450Lab4Q3{
		public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number;
		String result;
		
		System.out.print("Enter a number:");
		number = input.nextInt();
		
		result = (number > 0)? "positive":
		(number < 0) ? "negative":
		"zero";
		
		System.out.println("The number is:"+result);
	}
}		
	