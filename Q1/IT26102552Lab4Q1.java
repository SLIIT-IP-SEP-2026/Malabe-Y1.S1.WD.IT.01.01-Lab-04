import java.util.Scanner;

 public class IT26102552Lab4Q1{
	
	public static void main(String[] args)
	{
		double Number ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		Number = input.nextDouble();
		
		if
			 (Number > 0) 
			 {
			System.out.print(" The number is : Positive:");
		     }
		else if
		    (Number < 0)
			{
			System.out.print(" The number is : Negative:"); 
			}
		
		else 
			{
			System.out.print(" The number is : Zero");
			} 
		
		
		
    }
 }