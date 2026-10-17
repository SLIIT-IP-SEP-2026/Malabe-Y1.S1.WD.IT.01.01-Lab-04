import java.util.Scanner;

public class IT26102590Lab4Q2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the Exam Marks (out of 100):");
		double examMark= input.nextDouble();
		
		System.out.print("Enter the Lab submission Mark(out of 100):");
		double labSubmissionMark = input.nextDouble();
		
		if (examMark <0 || examMark>100 && labSubmissionMark <0 || labSubmissionMark>100)
		{
		System.out.println ("Invalid Marks" );
		
		return;
		}
		System.out.print("Please enter the percentage given for the exam:");	
		double examPercentage= input.nextDouble();
		
		System.out.print("Please enter the percentage given for the Lab:");	
		double labPercentage= input.nextDouble();
		
		if (examPercentage+labPercentage!=100)
		{
			System.out.println("The percentage must add up to 100. Terminating Program");
			return;
		}
		 double finalMark = (examMark * examPercentage/100)+ (labSubmissionMark * labPercentage/100);
		
		
		System.out.println();	
		System.out.println ("Final Mark is:" +finalMark ); 
	}
}