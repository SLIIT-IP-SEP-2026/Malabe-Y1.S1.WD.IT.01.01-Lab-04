import java.util.Scanner;

public class IT26102667Lab4Q2{
 
 public static void main(String[] args){
     
	 // Declare the veriables
       
	   double examMarks , labMarks ,examPrecentage ,labPrecentage ,finalMarks ;
     
	 //create a Scanner object to read input 

		Scanner input = new Scanner(System.in);
     
	 // Input and velidate exam marks
	      
		  System.out.print("Please enter exam marks (out of 100):");
           examMarks= input.nextDouble();
		  if (examMarks < 0 || examMarks> 100 ){
	     
		 System.out.println(" Invalid input for exam marks. Terminating program .");
     
	 return; // Exit the program
	
	}
	  

	  System.out.print(" Please enter the lab submission marks (out of 100):");
	       
		   labMarks= input.nextDouble();
	       
		   if (labMarks<0 || labMarks>100){
	   	 
		 System.out.println("Invalid inout for lab submission marks.Terminating program");

	      return; // exit the program
	
	}
	System.out.print("Please enter the precentage given for the exam:");
	   examPrecentage = input.nextDouble();
	   
	  System.out.print("Please enter the precentage given for the lab submission:"); 
	     labPrecentage = input.nextDouble();
		 
	if (examPrecentage+ labPrecentage!=100){
	System.out.println("The percentage must add up to 100.Terminating program.");
	return;
	}
	
	finalMarks= (examMarks*examPrecentage/100)+(labMarks*labPrecentage/100);
		System.out.println();
		System.out.println("Final exam marks is: " + finalMarks );
		}
		}
	