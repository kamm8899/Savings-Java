import java.util.Scanner;
public class SavingsAccount extends Bank{

	public SavingsAccount() {}
	public SavingsAccount(double startingBalance){//account opened with{
		this.balance= startingBalance;
}
	public SavingsAccount(int accountNumber, String holderName, double startingBalance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance= startingBalance;
	}
	public SavingsAccount( int accountNumber, String holderName) {
		this.accountNumber= accountNumber;
		this.holderName= holderName;
	}
	@Override
	void checkBalance() {
		System.out.println(balance);
		
	}
	@Override
	void deposit(double amount) {
		balance= balance+ amount;
		System.out.println("Amount: " + amount + " depisited to Account" + accountNumber);
		
	}
	@Override
	void withdrawl(double amount) {
		if(balance >= amount) {
			balance= balance- amount;
			System.out.println("Amount: " + amount + "withdrawed from Account"+ accountNumber);
		}
		else {
			System.out.println("Insuffcient balance in account");
		}
	}
	public void addInterest() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount added per month");
		
		
		for(int i=1; i<=12; i++) {
			System.out.println( "Enter amount deposited in " + i +"Month");
			balance = balance + ((sc.nextDouble()*4)/100);
		}
	}
	public int getAccountNumber() {

		return accountNumber;

	}

	public void setAccountNumber(int accountNumber) {

		this.accountNumber = accountNumber;

	}

	public String getHolderName() {

		return holderName;

	}

	public void setHolderName(String holderName) {

		this.holderName = holderName;

	}

	

	public void setBalance(double startingBalance) {

		this.balance = startingBalance;

	}



}
