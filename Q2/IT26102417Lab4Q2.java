import java.util.Scanner;

 public class IT26102417Lab4Q2{
      public static void main(String[]args){

        Scanner input = new Scanner(System.in);
		
		int subMark , examMark  , examPercen , labPercen , labMark;
		double finalMark;
		
		System.out.print(" Please enter the exam mareks (out of 100):");
		  examMark = input.nextInt();
		  
	    if(examMark < 0 || examMark > 100){
         System.out.print("Invalid input for exam marks .Terminating program");
         return;	   
	   }
		
		System.out.print("Please enter the lab submission marks(out of 100): ");
          labMark = input.nextInt();
	

        if(labMark < 0 || labMark >100){
         System.out.print("Invalid input for the lab marks.Terminating the program ");
	      return;
		}
		
		
		System.out.print("PLease enter the percentage given to the exam :"); 
          examPercen = input.nextInt();
		  
		System.out.print("Pleas enter the percentage given to the lab submission:");  
          labPercen = input.nextInt();

         if(examPercen + labPercen != 100 ){
			 System.out.print("The pecentages must add up to 100.Terminating program");
			 return;
		 }
 
       finalMark = (examMark * examPercen/100) + (labMark * labPercen/100);
	   
	   
	   
	    System.out.println();
		System.out.println("Final Exam :" + finalMark);




       }
} 