
public class Account extends Bank {
	
	public final double overdraft= 10000;
		
		
	public Account() {}
		public Account(double startingBalance) //new account with specific amount
		{
			this.balance= startingBalance;
			
		}
		public Account(int accountNumber, String holderName, double startingBalance) {
			this.accountNumber = accountNumber;
			this.holderName = holderName;
			this.balance=startingBalance;
		
		}
		public Account(int accountNumber, String holderName) {
			this.accountNumber= accountNumber;
			this.holderName= holderName;
		}
		@Override
		void checkBalance() {
			System.out.println(balance);
		}
		@Override
		void deposit(double amount) {
			balance= balance + amount;
			System.out.println("Amount: "+ amount+ "deposited to Account number " + accountNumber);
		}
		@Override 
		void withdrawl(double amount) {
			if(balance>= amount) {
				
			balance = balance-amount;
			System.out.println("Amount: " + amount+ "withdrawed from Account number" + accountNumber);
			
			}
			else if(overdraft <= amount) {
				System.out.println("Amount: "+ amount + "withdraed from account Number" + accountNumber);
			}
			else {
				System.out.println("overdraft exceeded");
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
//		@Override
//		int getAccountnumber() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
		}
		
	


