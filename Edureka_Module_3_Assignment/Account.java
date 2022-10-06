
public abstract class Account {

	private long accountNumber;
	private String customerName;
	private float amount;
	private String accountType;
		
	public Account(long accountNumber, String customerName, float amount, String accountType){
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.amount = amount;		
		this.accountType = accountType;
	}
	public void deposit(long accountNumber, float amount) {
		this.amount = this.amount + amount;
		System.out.println("Amount " + amount + "deposited. New balance is " + this.amount);
	}
	
	public void withDraw(long accountNumber, float amount) {
		if (this.amount - amount >= 0) {
			this.amount = this.amount - amount;
			System.out.println("Amount " + amount + "withdrew and New balance is " + this.amount);
		}
		else {
			System.out.println("Amount " + amount + "cannot be withdrawn!!! Insufficient Balance. Current balance is " + this.amount);
		}
	}
	
	public void getDetails() {
		
		System.out.print("Account = " + getAccountNumber());
		System.out.print("\nCustomerName =  " + getCustomerName());
		System.out.print("\nCurrentBalance =  " +  getAmount());
		System.out.print("\nAccountType =  " +  getAccountType());
		
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getAmount() {
		return this.amount;
	}
	public String getAccountType() {
		return this.accountType;
	}
	
	
}
