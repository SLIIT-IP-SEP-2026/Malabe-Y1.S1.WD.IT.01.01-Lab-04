import java.util.Scanner;

public class IT26102396Lab4Q3{

public static void main(String[] args){

	int number;
	String result;
	
Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
number = input.nextInt();

result = (number > 0 ) ? "The number is: Positive" :
		(number < 0 ) ? "The number is: Negetive" :
		"Number is: Zero";
		

System.out.println(result);


}

}