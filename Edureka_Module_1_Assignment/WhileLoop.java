import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		//Write a program to print 10 even numbers and 10 odd numbers.
		
		//Even numbers
		System.out.println("Even Numbers");
		
		int i = 2;
		while (i<22) {			
			System.out.print(i + ",");
			i=i+2;
		}
		//Odd numbers
		System.out.println();
		System.out.println("Odd Numbers");
		i = 1;
		while (i<20) {			
			System.out.print(i + ",");
			i=i+2;
		}
		//Write a program to find factorial of a number.
		System.out.println();
		System.out.print("Enter the number to find the factorial:");
		int num = scanner.nextInt();
		int factorial = num;
		i = num -1;
		while(i>1){			
			
			factorial = factorial * i;
			i--;
		}
		System.out.print("Factorial of " + num + " is " + factorial);
		
		//Write a program to generate tables of 10.
		
		System.out.println();
		System.out.print("Enter the Number for Multiplication: ");
		num =scanner.nextInt();
		i= 1;
		while(i<=10){
			System.out.println( num + " x " + i + " = " + num*i);
			i++;
			}
		
		//Write a program to add the digits of a number.
		System.out.println();
		System.out.print("Enter the Number for Adding the digits: ");
		num =scanner.nextInt();
		int sumOfDigits = 0;
		i = num;
		while(i>0)
		{
			
			sumOfDigits += (i%10);
			i =i/10;
		}
		System.out.println("Sum Of Digits for " + num + " is " +sumOfDigits); 		
		
		//Write a program to reverse the digits of a number.
		System.out.println();
		System.out.print("Enter the Number for reversing the digits: ");
		num =scanner.nextInt();
		i = num;
		while(i>0)
		{
			
			System.out.print(i%10);
			i= i/10;
		}
		
		//Write a program to generate 10 Fibonacci numbers
		System.out.println();
		
		int fibonacciSeries1 = 1;
		int fibonacciSeries2 = 1;
		int saveSeries =0;
		i =2;
		while(i<=10) {
			
			
			if(i==2) {
				System.out.print(fibonacciSeries1 + "," + fibonacciSeries2);
			}
			
			else {
				saveSeries = fibonacciSeries2;
				fibonacciSeries2 = fibonacciSeries1 + fibonacciSeries2;
				fibonacciSeries1 = saveSeries;
				System.out.print("," + fibonacciSeries2);
			}		
			i++;
		}
		scanner.close();

	}

}
