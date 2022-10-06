
public class SB_Account extends Account{

	private static float interestRate = 4.00F;
	private int term_in_months;
	

	SB_Account (long accountNumber, String customerName, float amount, int term_in_months){
		super(accountNumber,customerName,amount,"Savings");
		
	}


	@Override
	public void deposit(long accountNumber, float amount) {
		// TODO Auto-generated method stub
		super.deposit(accountNumber, amount);
	}


	@Override
	public void withDraw(long accountNumber, float amount) {
		// TODO Auto-generated method stub
		super.withDraw(accountNumber, amount);
	}


	public static float getInterestRate() {
		return interestRate;
	}
	
	
	public int getTerm_in_months() {
		return term_in_months;
	}

	public void setTerm_in_months(int term_in_months) {
		this.term_in_months = term_in_months;
	}

	public float calculateInterest() {
		
		return (this.term_in_months * getAmount() * this.interestRate);
		
	}
}
