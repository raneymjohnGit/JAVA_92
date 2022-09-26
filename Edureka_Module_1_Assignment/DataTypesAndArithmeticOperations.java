/*
  Author : Raney Mathew John
  Date : 09/26/2022
  Assignment : Data types and Arithmetic Operations
 */

public class DataTypesAndArithmeticOperations {

	public static void main(String[] args) {
		

		//byte data type
		byte byteNum1 = 20;
		byte byteNum2 = 10;
		addition(byteNum1, byteNum2);
		subtraction(byteNum1, byteNum2);
		multipliction(byteNum1, byteNum2);
		division(byteNum1, byteNum2);
		increment(byteNum1, byteNum2);
		decrement(byteNum1, byteNum2);
		
		
		//short data type
		short shortNum1 = 20;
		short shortNum2 = 10;
		addition(shortNum1, shortNum2);
		subtraction(shortNum1, shortNum2);
		multipliction(shortNum1, shortNum2);
		division(shortNum1, shortNum2);
		increment(shortNum1, shortNum2);
		decrement(shortNum1, shortNum2);
		
		//Int data type
		int intNum1 = 20;
		int intNum2 = 10;
		addition(intNum1, intNum2);
		subtraction(intNum1, intNum2);
		multipliction(intNum1, intNum2);
		division(intNum1, intNum2);
		increment(intNum1, intNum2);
		decrement(intNum1, intNum2);

		//long data type	
		long longNum1 = 444444L;
		long longNum2 = 222222L;
		addition(longNum1, longNum2);
		subtraction(longNum1, longNum2);
		multipliction(longNum1, longNum2);
		division(longNum1, longNum2);
		increment(longNum1, longNum2);
		decrement(longNum1, longNum2);
		
		
		//float data type	
		float floatNum1 = 444444.00F;
		float floatNum2 = 222222.00F;
		addition(floatNum1, floatNum2);
		subtraction(floatNum1, floatNum2);
		multipliction(floatNum1, floatNum2);
		division(floatNum1, floatNum2);
		increment(floatNum1, floatNum2);
		decrement(floatNum1, floatNum2);
		
		//double data type	
		double doubleNum1 = 444444.00;
		double doubleNum2 = 222222.00;
		addition(doubleNum1, doubleNum2);
		subtraction(doubleNum1, doubleNum2);
		multipliction(doubleNum1, doubleNum2);
		division(doubleNum1, doubleNum2);
		increment(doubleNum1, doubleNum2);
		decrement(doubleNum1, doubleNum2);
		
		//char data type	
		char charNum1 = 'A';
		char charNum2 = 'B';
		addition(charNum1, charNum2);
		subtraction(charNum1, charNum2);
		multipliction(charNum1, charNum2);
		division(charNum1, charNum2);
		increment(charNum1, charNum2);
		decrement(charNum1, charNum2);
		
		//boolean data type	
		boolean booleanNum1 = true;
		boolean booleanNum2 = false;
		addition(booleanNum1, booleanNum2);
		subtraction(booleanNum1, booleanNum2);
		multipliction(booleanNum1, booleanNum2);
		division(booleanNum1, booleanNum2);
		increment(booleanNum1, booleanNum2);
		decrement(booleanNum1, booleanNum2);
	}

	
	public static void addition (int num1, int num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (int num1, int num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (int num1, int num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (int num1, int num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (int num1, int num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (int num1, int num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}

	
	//Byte Methods
	public static void addition (byte num1, byte num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (byte num1, byte num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (byte num1, byte num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (byte num1, byte num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}
	public static void increment (byte num1, byte num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (byte num1, byte num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	
	
	//Short methods
	public static void addition (short num1, short num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (short num1, short num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (short num1, short num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (short num1, short num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (short num1, short num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (short num1, short num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	
	//Long methods
	public static void addition (long num1, long num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (long num1, long num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (long num1, long num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (long num1, long num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (long num1, long num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (long num1, long num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	
	//float methods
	public static void addition (float num1, float num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (float num1, float num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (float num1, float num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (float num1, float num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (float num1, float num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (float num1, float num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	
	//double methods
	public static void addition (double num1, double num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (double num1, double num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (double num1, double num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (double num1, double num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (double num1, double num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (double num1, double num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	//char methods
	public static void addition (char num1, char num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (char num1, char num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (char num1, char num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (char num1, char num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (char num1, char num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (char num1, char num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
	//boolean methods
	public static void addition (boolean num1, boolean num2){
		
		System.out.println(" Addition of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	public static void subtraction (boolean num1, boolean num2){
		
		System.out.println(" Subtraction of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " - " + num2 + " = " + (num1 - num2));
	}
			
	public static void multipliction (boolean num1, boolean num2){
		
		System.out.println(" Multiplication of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " * " + num2 + " = " + (num1 * num2));
	}
		
	public static void division (boolean num1, boolean num2){
		
		System.out.println(" Division of " +  ((Object)num1).getClass().getSimpleName() + " data types " + num1 + " / " + num2 + " = " + (num1 / num2));
	}	
	public static void increment (boolean num1, boolean num2){
		
		System.out.println(" Increment of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "++" + num1 + " = " + ++num1 + " and " + num2 + "++ = " + num2++);
	}	
	
	public static void decrement (boolean num1, boolean num2){
		
		System.out.println(" Decrement of " +  ((Object)num1).getClass().getSimpleName() + " data types " + "--" + num1 + " = " + --num1 + " and " + num2 + "-- = " + num2--);
	}
}
