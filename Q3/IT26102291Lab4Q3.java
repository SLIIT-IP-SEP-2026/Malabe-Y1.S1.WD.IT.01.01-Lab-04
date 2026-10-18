import java.util.Scanner;

public class IT26102291Lab4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        String result = (num > 0) ? "Number is Positive" : 
                        (num < 0) ? "Number is Negative" : "Number is Zero";
        
        System.out.println(result);

        
    }
}