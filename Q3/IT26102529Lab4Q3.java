import java.util.Scanner;

public class IT26102529Lab4Q3{
	public static void main(String[]args){
	 
	 Scanner input=new Scanner(System.in);
	 
	 System.out.print("Enter your no: ");
	 int number =input.nextInt();
	 
	 String result=(number>0)? " positive" :
                    (number<0)? " negative" :  
                    " Zero" ;

	System.out.print("Result" +result);			
	 

	 
	}
}