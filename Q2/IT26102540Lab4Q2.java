import java.util.Scanner;
public class IT26102540Lab4Q2 {
    public static void main(String[]args){
        double exammarks, labmarks, exampercentage, labpercentage, finalmark;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter exam marks (out of 100): ");
        exammarks = input.nextDouble();
        if (exammarks < 0 || exammarks > 100){
            System.out.println("Invalid input for exam marks. Terminating program");
            return;
        }
        System.out.print("Please enter lab submission marks (out of 100):");
        labmarks = input.nextDouble();
        if (labmarks < 0 || labmarks > 100){
            System.out.println("Invalid input for lab lab submission marks. Terminating progran");
        }    
        System.out.print("Please enter the percentage given for the exam: ");
        exampercentage = input.nextDouble();
        System.out.print("Please enter the percentage given for lab submission: ");
        labpercentage = input.nextDouble();

        if (exampercentage + labpercentage != 100){
            System.out.println("The percentages must add up to 100. Terminating program");
            return; 
        }
        finalmark = (exammarks * exampercentage / 100) + (labmarks * labpercentage / 100);

        System.out.println();
        System.out.println("Final Exam mark is : + finalmark");    
    }
}