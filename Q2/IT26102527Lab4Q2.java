import java.util.Scanner;

public class IT26102527Lab4Q2{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		double examMarks,labSubmission,finalMark ;
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		if (examMarks < 0 || examMarks> 100){
			System.out.println("Invalid input for exam marks. Terminating programme");
			return;
		}
		
		
		System.out.print("Please enter lab submission marks (out of 100); ");
		labSubmission = input.nextDouble();
		if (labSubmission < 0 || labSubmission> 100){
			System.out.println("Invalid input for lab submission marks. Terminating programme");
			return;
		}
		
		System.out.print("Please enter the percentage given for exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.print("Please enter the percentage given for lab submission: ");
		double labPercentage = input.nextDouble();
		
		
		if (examPercentage + labPercentage != 100) {
			System.out.println("The percentage mus add upto 100. Terminating programme");
			return;
		}
		
		finalMark = (examMarks *examPercentage/ 100) + (labSubmission *labPercentage/100);
		
		System.out.println();
		System.out.println("Final Mark :" + finalMark);
		
		}
		
}
		
		
		
		