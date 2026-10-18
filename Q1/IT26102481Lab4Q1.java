import java.util.Scanner;
	public class IT26102481Lab4Q1{
	public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("enter a number - ");
		number=input.nextInt();
		
		if(number<0){
			System.out.println("the number is: negative");
		}
		else if(number>0){
			System.out.println("the number is: positive");
		}
		else{
			System.out.println("the number is zero");
		}
			
	}
	}
		