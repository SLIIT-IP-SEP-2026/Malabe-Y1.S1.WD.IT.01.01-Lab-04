import.java .util.scanner
public class IT26102298Lab4Q2{
	
	public static void main (string[]args) {
		Scanner.out.print
		
		
		
	if (examMarks < 0 || examMarks > 100) { 
	System.out.println("Invalidinpur for lab marks.terminating program.");
	sc.close();
	return;
	
	}
	
	System.out.print("please enter lab submission marks (out of 100):");
	double labMarks = sc.nextDouble();
	
	if (labMarks < 0 || labMarks  > 100 ){
	System.out.println("Invalidinpur for lab marks. Terminating program .");
	sc.close();
	return
	
	}
	
	System.out.print("please enter the percentage given for the exam: ");
	double examPercent = sc.nextDouble();
	
	System.out.print("pleace enter the percentagegiven for the exam: ");
	double labPercent = sc.nextDouble();
	
	if (examPercent + labPercent != 100);
		System.out.println("The percentage must add up to 100.Terminatingprogram.");
		sc.close();
		return
		
	}
	
	double finalMarks = (examMarks * examPerecnt / 100) + (labmarks * labpercent / 100);
	System.out.println();
	System.out.println("final exam marksis : " + finalMarks);
	sc.close();
}
