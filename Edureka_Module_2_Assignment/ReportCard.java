import java.util.Scanner;

public class ReportCard {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter the name of the student : ");
		String name  = scanner.nextLine();
		System.out.print("\nEnter the number of subjects : ");
		int numberOfSubjects  = scanner.nextInt();
		scanner.nextLine();
		int marks[] = new int[numberOfSubjects];
		
		marksEntry (numberOfSubjects, marks);
		printReportCard(name, marks);
		scanner.close();
	}
		
	public static void marksEntry(int numberOfSubjects, int marks[]) {
		
		Scanner scanner1 = new Scanner (System.in);
		for (int i = 0; i< numberOfSubjects; i++){
			
			System.out.print("\nEnter the mark for subject-" + (i+1) + ": ");
			marks[i] = scanner1.nextInt();
			scanner1.nextLine();			
		}
		scanner1.close();
	}
	public static void printReportCard(String name, int marks[]) {
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("                        REPORT CARD                             ");
		System.out.println("Name : " + name);
		System.out.println("----------------------------------------------------------------");
		System.out.println("\tSUBJECT" + "\t\t\tMARKS");
		System.out.println("----------------------------------------------------------------");
		
		int totalMarks = 0;
		
		for (int i = 0; i< marks.length; i++){
			
			System.out.print("\n\tSubject-" + (i+1)+ "\t\t" + marks[i]);
			totalMarks = totalMarks + marks[i];
						
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("\n\tTotal :" + totalMarks + " \tAverage: " + (totalMarks/marks.length));
		System.out.println("----------------------------------------------------------------");
	}
	
}
