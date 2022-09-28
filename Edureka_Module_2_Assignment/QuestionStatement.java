import java.util.Scanner;

public class QuestionStatement {
	
	public static void main(String args[]) {
	Scanner scanner = new Scanner (System.in);
	
	int id[] =  new int[5]; 
	String name[] = new String[5];
	int salaries[] = new int[5];
	
	for (int i = 0; i<5;i++) {
		
		System.out.println("Enter the Id for the Employee number " + (i+1) + ":");
		id[i] = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the Name for the Employee number " + (i+1) + ":");
		name[i] =scanner.nextLine();
		
		System.out.println("Enter the Salary for the Employee number " + (i+1) + ":");
		salaries[i] = scanner.nextInt();
		scanner.nextLine();
	}
	
	
	//Question statement 1
	display(id, name, salaries);
	display(id, name);
	
	System.out.println("Enter the Employee name to be searched:");
	String employeeName =scanner.nextLine();
	
	display(employeeName, id, name, salaries);
	scanner.close();
	}
	//Question statement 1
	 public static void display(int id[], String name[], int salaries[] ) {
		 
		System.out.println("Id\t" + "Name\t" + "Salary");
		for (int i = 0; i<5;i++) {
			System.out.println(id[i] + "\t" + name[i] + "\t" + salaries[i]);
		}
	 }
		//Question statement 2
	 public static void display(int id[], String name[]) {
		 
		System.out.println("Id\t" + "Name\t");
		for (int i = 0; i<5;i++) {
			System.out.println(id[i] + "\t" + name[i]);
		}
	 }
	 
		//Question statement 3
	 public static void display(String employeeName, int id[], String name[], int salaries[] ) {
		 
		System.out.println("Id\t" + "Name\t" + "Salary");
		boolean employeeFound = false;		
		for (int i = 0; i<5;i++) {
			if(employeeName.equals(name[i])) {
				System.out.println(id[i] + "\t" + name[i] + "\t" + salaries[i]);
				employeeFound = true;
				break;
			}			
		}
		if (!employeeFound) { 
			System.out.println("Employee " +  employeeName + " Not Found");
		}
	 }
}
