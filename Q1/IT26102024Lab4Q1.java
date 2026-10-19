import java.util.Scanner;

public class IT26102024Lab4Q1 {

    public static void main(String[] args) {

        int number;
        String message;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number < 0) {
            message = "The number is: Negative";
        }
        else if (number > 0) {
            message = "The number is: Positive";
        }
        else {
            message = "The number is Zero";
        }

        System.out.println(message);
    }
}