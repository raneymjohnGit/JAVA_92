import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int userOption;
		int accountTypeInput;
		float depositAmount;
		Scanner scanner = new Scanner(System.in);
		Account a1 = new SB_Account(0, null, 00.00F, 0);
		userOption = displayMenu();
		while(userOption != 5) {
			switch (userOption) {
			
			case 1:				
				if (a1.getAccountNumber() == 0) {
					
				
				accountTypeInput = validateAccountType();	
				if (accountTypeInput == 1) {
					a1 = new SB_Account(1000001, "Raney Mathew John", 100.00F, 12);
					System.out.println( a1.getAccountType() + " Account Created");
				}else if (accountTypeInput == 2) {
					a1 = new CurrentAccount(2000001, "Sunil Joseph", 200.00F);
					System.out.println( a1.getAccountType() + " Account Created");
				}
				else {
					System.out.println("Account Not Created");
				}
				}
				else {
					System.out.println("Account Already Exists");
					System.out.println();
					a1.getDetails();
					System.out.println();
					
				}
				System.out.println();
				break;
			
			case 2:				
				
				if(a1.getAccountNumber()== 0){
					System.out.println("Account not exits. Please Create one");
				}
				else {
					System.out.print("Enter the amount to be deposited: ");
					depositAmount =  scanner.nextFloat();
					scanner.nextLine();
					a1.deposit(a1.getAccountNumber(),depositAmount);
				}
				break;
			
			case 3:				
				
				if(a1.getAccountNumber()== 0){
					System.out.println("Account not exits. Please Create one");
				}
				else {
					System.out.print("Enter the amount to be withdrawn: ");
					depositAmount =  scanner.nextFloat();
					scanner.nextLine();
					a1.withDraw(a1.getAccountNumber(),depositAmount);
				}
				break;
			
			case 4:				
				
				if(a1.getAccountNumber()== 0){
					System.out.println("Account not exits. Please Create one");
				}
				else {
					a1.getDetails();
					
					System.out.println();
				}
				break;
			default:
				
				break;
			}
			userOption = displayMenu();
			
			
		}

		System.exit(0);
		
	}
	
	public static int displayMenu() {
		
		boolean redisplay = true;
		int userInput = 0;	
		Scanner scanner1 = new Scanner(System.in);
		do{
			System.out.println("----------- Banking Application ---------------");
			System.out.println("1.Create Account ");
			System.out.println("2.Deposit Amount ");
			System.out.println("3.Withdraw Amount ");
			System.out.println("4.Balance Amount ");
			System.out.println("5.Exit ");
			System.out.print("Enter your option: ");
			
			
			userInput =  scanner1.nextInt();
			scanner1.nextLine();
			
			if (userInput >=1 & userInput <= 5) {
				redisplay = false;
			}
			else {
				System.out.println("Invalid Option Entered. Please try again");
			}
			
			
		}while(redisplay);

		return userInput;
	}
	
	public static int validateAccountType() {
		
		int accountTypeInput;
		boolean invalidAccountType = false;
		do {
		System.out.println();
		System.out.println();
		System.out.println("Enter Account Type");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("3.Cancel Account Creation");
		System.out.print("Enter your option: ");
		
		Scanner scanner2 = new Scanner(System.in);
		accountTypeInput =  scanner2.nextInt();
		scanner2.nextLine();


		
		if (accountTypeInput >=1 & accountTypeInput <= 3) {
			return accountTypeInput;
		}
		
		else {
			System.out.println("Invalid Option Entered. Please try again");
		}
		}while(invalidAccountType);
		
		return accountTypeInput;
		
	}
}
