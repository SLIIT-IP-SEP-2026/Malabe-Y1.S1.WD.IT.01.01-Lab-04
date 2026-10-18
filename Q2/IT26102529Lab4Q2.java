import java.util.Scanner;

 public class IT26102529Lab4Q2{
	public static void main(String[]args){
	 
	 Scanner input=new Scanner(System.in);
	 
	 System.out.print("Enter your Exam marks : ");
	 int exammarks =input.nextInt();
	 
	 
	 if(exammarks>100 || exammarks<0){
		 System.out.println("Invalid input for exam marks. Terminating program.");
		 
	 }else{
		 System.out.print("Enter your Lab marks : ");
	     int labmarks =input.nextInt();
		 
		 if(labmarks<0 || labmarks>100){
			 System.out.println("Invalid input for exam marks. Terminating program.");
			 
		 }else{
			 System.out.print("Please enter the percentage of exam: ");
                int examPercentage = input.nextInt();

                System.out.print("Please enter the percentage lab submission: ");
                int labPercentage = input.nextInt();
			
			if(examPercentage+labPercentage!=100){
				System.out.println("The percentages must add up to 100. Terminating program.");
			}else{
				
				int fullmarks=(exammarks*examPercentage/100)+(labmarks*labPercentage/100);
				
				System.out.println("The Fullmarks : "+fullmarks);
			}
		 }
		 
	 }
	}
}