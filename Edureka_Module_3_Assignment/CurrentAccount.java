
public class CurrentAccount extends Account{
	
	private final static int MAX_TRANSACTOIN_COUNT = 10;
	private final static float SERVICE_CHARGE_PER_TRANSACTION = 3.00F;
	private static int transactionCount ;
	
	
	CurrentAccount (long accountNumber, String customerName, float amount){
		super(accountNumber,customerName,amount,"Current");
		
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


	public static int getTransactionCount() {
		return transactionCount;
	}

	public static void setTransactionCount(int transactionCount) {
		CurrentAccount.transactionCount = transactionCount;
	}


	public float calculateServiceCharge() {
		
		if (transactionCount > MAX_TRANSACTOIN_COUNT) {
			
			return ((this.transactionCount - MAX_TRANSACTOIN_COUNT) * SERVICE_CHARGE_PER_TRANSACTION);
			
		}
		else {
			return 0.00F;
		}
		
	}

}
