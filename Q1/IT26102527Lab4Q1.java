import java.util.Scanner;

public class IT26102527Lab4Q1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0){
        System.out.println("The Number is : Positive");
        }

        else if (number < 0){
        System.out.print("The Number is : Negative");

        }

        else{
        System.out.print("The number is Zero");
        }
    }
}