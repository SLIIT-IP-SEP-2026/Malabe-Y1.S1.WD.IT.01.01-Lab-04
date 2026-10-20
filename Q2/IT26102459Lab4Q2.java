
import java.util.Scanner;

public class IT26102459Lab4Q2 {

    public static void main(String[] args) {

        double labMark, examMark;
        double examPercentage, labPercentage;
        double finalMark;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exam marks (out of 100): ");
        examMark = input.nextDouble();

        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for marks. Terminating programme.");
            return;
        }

        System.out.print("Please enter the lab submission marks (out of 100): ");
        labMark = input.nextDouble();

        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for the lab marks. Terminating programme.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating programme.");
            return;
        }

        finalMark = (examMark * examPercentage / 100)
                  + (labMark * labPercentage / 100);

        System.out.println();
        System.out.println("Final Exam Mark is: " + finalMark);

        input.close();
    }
	
}

import java.util.Scanner;

public class IT26102459Lab4Q2 {

    public static void main(String[] args) {

        double labMark, examMark;
        double examPercentage, labPercentage;
        double finalMark;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exam marks (out of 100): ");
        examMark = input.nextDouble();

        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for marks. Terminating programme.");
            return;
        }

        System.out.print("Please enter the lab submission marks (out of 100): ");
        labMark = input.nextDouble();

        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for the lab marks. Terminating programme.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentage must add up to 100. Terminating programme.");
            return;
        }

        finalMark = (examMark * examPercentage / 100)
                  + (labMark * labPercentage / 100);

        System.out.println();
        System.out.println("Final Exam Mark is: " + finalMark);

        input.close();
    }
	
}
