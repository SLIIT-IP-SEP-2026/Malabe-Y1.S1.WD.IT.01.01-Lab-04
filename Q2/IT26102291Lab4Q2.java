import java.util.Scanner;

public class IT26102291Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter exam marks (0-100): ");
        double examMarks = sc.nextDouble();
        
        System.out.print("Enter lab submission marks (0-100): ");
        double labMarks = sc.nextDouble();

        // Validation for marks
        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            sc.close();
            return;
        }

        System.out.print("Enter percentage taken from exam: ");
        double examPercent = sc.nextDouble();

        System.out.print("Enter percentage taken from lab: ");
        double labPercent = sc.nextDouble();

        // Validation for percentages
        if (examPercent + labPercent != 100) {
            System.out.println("Invalid percentages! Percentages should add to 100.");
            sc.close();
            return;
        }

        double finalMark = (examMarks * examPercent / 100) + (labMarks * labPercent / 100);
        System.out.println("Final Mark: " + finalMark);

        
    }
}