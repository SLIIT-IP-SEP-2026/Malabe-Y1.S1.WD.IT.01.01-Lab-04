import java.util.Scanner;
	public class IT26102481Lab4Q3{
		public static void main(String[] arg){
			Scanner input = new Scanner(System.in);
			
			int number;
			String result;
			
			System.out.print("enter a number : ");
			number=input.nextInt();
			
			result=(number>0)?"the number is positive":
					(number<0)?"the number is negative": "the number is zero";
					
			System.out.print(result);
			
		}
	}