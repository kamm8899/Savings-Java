
abstract class Bank {
	public int accountNumber;
	public String holderName;
	public double balance;
	public final int minimumAccountBalance=50;
	public final int interestRateForSavingsAccount=4;//4% Intrest Rate
	abstract void checkBalance();
	abstract void deposit(double amount);
	abstract void withdawl(double amount);
	abstract void setBalance(double startingBalance);
	abstract void setHolderName(String holderName);
	abstract void setAccountNumber(int accountNumber);
	abstract String getHolderName();
	abstract int getAccountnumber();
	public void addInterest() {
		
	}
	

}
