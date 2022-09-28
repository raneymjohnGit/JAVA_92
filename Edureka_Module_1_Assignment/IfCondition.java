import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner (System.in);
		
		//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)
		System.out.print("Enter candidate age:");
		int age = scanner.nextInt(); 
		
		if (age < 18) {
			System.out.println("Candidate not eligible for voting");
		}
		else {
			System.out.println("Candidate eligible for voting");
		}		
		
		System.out.println();
		
		//Write a program to check if the number is positive or negative
		//Extend the previous program to check whether the given number is positive, zero or negative.(Hint: use if-else conditions)
		System.out.print("Enter the number:");
		int num = scanner.nextInt(); 
		
		if (num < 0) {
			System.out.println("Number " + num  + " is Negative");
		}
		else if (num == 0) {
		
			System.out.println("Number " + num  + " is Zero");
		}
		else {
			System.out.println("Number " + num  + " is Positive");
		}
		
		//Write a program to find largest of two numbers.
		
		System.out.print("Enter the First number:");
		int num1 = scanner.nextInt(); 
		
		System.out.print("Enter the Second number:");
		int num2 = scanner.nextInt();
		
		if (num1 == num2) {
			System.out.println("Number " + num1  + " is Eqaul to " + num2);
		}
		else if (num1 > num2) {
		
			System.out.println("Number " + num1  + " is Greater than " + num2);
		}
		else {
			
			System.out.println("Number " + num1  + " is Less than " + num2);		
		}
		
		//Write a program to find largest of two numbers.
		
		System.out.print("Enter the  number:");
		int num3 = scanner.nextInt(); 
		
		
		if (num3 % 2 == 0) {
			System.out.println("Number " + num3  + " is Even");
		}
		else {
			
			System.out.println("Number " + num3  + " is Odd");		
		}		
						
		scanner.close();
	}
}
