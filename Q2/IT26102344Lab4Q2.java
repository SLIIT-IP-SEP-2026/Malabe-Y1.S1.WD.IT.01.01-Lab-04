import java.util.Scanner;

	  public class IT26102344Lab4Q2{
		
	  public static void main(String[] arg){
		
		Scanner input = new Scanner(System.in);
		
		 double examMarks,labMarks,labPrecentage,examprecentage,finalMark;
		
			System.out.print("Please enter the exam mark(out of 100):");
			 examMarks=input.nextDouble();
			
				if(0> examMarks || examMarks>100){
				System.out.print("Invalid input for exam marks.terminating program.");
				return;
				}
				
			    System.out.print("Please enter the lab marks(out of 100):");
	            labMarks=input.nextDouble();
			
				if(0> labMarks||labMarks>100){
				System.out.print("Invalid input for exam marks.terminating program.");
				return;			
				}
				
				System.out.print("Please enter the percentagem given for the exam:");
				examprecentage=input.nextDouble();
				
				System.out.print("Please enter the percentagem given for the lab:");
				labPrecentage=input.nextDouble();
				
				if(examprecentage+labPrecentage!=100){
				System.out.print("Invalid input for exam marks.terminating program.");
				return;
				}
				
				finalMark=(examMarks*examprecentage/100)+(labMarks*labPrecentage/100);
				
				System.out.print("Final exam mark is : "+finalMark);
				
	}
	}