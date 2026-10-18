import java.util.Scanner;

public class IT26101970Lab4Q3 {

    public static void main(String[] args) {

        // Declaring the variables
        double number;
        String result;

        // Creating the Scanner input
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter a number:  ");
        number = input.nextInt();

        // Determining whether the number is positive or negative using Ternary Operator
        result = (number > 0) ? "The number is: Positive" :
                (number < 0) ? "The number is: Negative":
                        "The number is: Zero";

        // Output the results
        System.out.println();
        System.out.println(result);
    }
}
