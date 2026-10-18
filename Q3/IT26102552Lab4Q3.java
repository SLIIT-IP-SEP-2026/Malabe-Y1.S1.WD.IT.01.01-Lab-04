import java.util.Scanner;

 public class IT26102552Lab4Q3{
	
	public static void main(String[] args)
	{
		int Number ;
		String result;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		Number = input.nextInt();
		
		result = (Number > 0) ? "The number is: Positive" :
                 (Number < 0) ? "The number is: Negative" : "The number is: Zero";

        System.out.println(result);

        
		
		
		
    }
 }