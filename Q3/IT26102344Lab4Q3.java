import java.util.Scanner;

	public class IT26102344Lab4Q3{
	
		public static void main(String[] arg){
		
			Scanner input = new Scanner(System.in);
			
			int number;
			String result;
			
			  System.out.print("Enter a number : ");
			  number=input.nextInt();
			
			   result=(number>0)?"The number is Positive":
					(number<0)?"The number is negative": "The number is Zero";
					
			    System.out.print(result);
			
		}
	}