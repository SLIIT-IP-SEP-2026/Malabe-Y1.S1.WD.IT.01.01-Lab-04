import java.util.Scanner;
	public class IT26102540Lab4Q1{
		public static void main(String[]args){
			Scanner Input = new Scanner(System.in);
				int no1;
				System.out.print("Enter a number:");
					no1 = Input.nextInt();
						if (no1>=1){
							System.out.print("The nujmber is: Positive");
						}else if (no1==0){
								System.out.print("The number is: Negative");
						}else 
								System.out.print("The number is: Zero");
		}
	}
