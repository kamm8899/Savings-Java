
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBank {

public static void main(Strings args[]) {
	List<Bank> recordOfAccounts = new ArrayList<Bank>();
	Bank account1 = new SavingsAccount();//creating using default constructor and  setting 
	
	account1.setAccountNumber(1885);;
	account1.setHolderName("Jessica");
	account1.setBalance(3500);
	
	
	Bank account2= new SavingsAccount(1234, "Abby", 450);
	Bank account3 = new SavingsAccount(345, "Dane");
	account3.setBalance(200);
	recordOfAccounts.add(account1);
	recordOfAccounts.add(account2);
	recordOfAccounts.add(account3);
	
	 Bank account4=new Account();//creating using default constructor.

  	 account4.setAccountNumber(50); // setting values by setter methods.

  	 account4.setHolderName("Abhi");

  	 account4.setBalance(700);

  	 Bank account5=new Account(51,"Vai",8000);

  	 Bank account6=new Account(52,"Jack");

  	 account6.setBalance(540);

  	 recordOfAccounts.add(account4);

  	 recordOfAccounts.add(account5);

  	 recordOfAccounts.add(account6);

  	Scanner sc=new Scanner(System.in);

  	while(true)

  	{

  		System.out.println("WELOME TO THE BANK>>>");

    	System.out.println("1. to open new account");

    	System.out.println("2. check balance");

    	System.out.println("3. deposit amount");

    	System.out.println("4. withdraw amount");

    	System.out.println("5. get Interest on savings account ");

    	System.out.println("6. view all accounts");

    	System.out.println("7. exit");
    	
    	System.out.println("Enter your choice as 1,2,3,4,5,6");
    	switch(sc.nextInt()){
    		
    	case 1:

  			System.out.println(" enter S for savings account and C for current account");

  			String input=sc.next();

  			if(input.equals("S") || input.equals("s"))

  			{

  				Bank account=new SavingsAccount();

  				System.out.println("enter account number");

  				account.setAccountNumber(sc.nextInt());

  				System.out.println("enter holder name");

  				account.setHolderName(sc.next());

  				System.out.println("enter balance");

  				double b=sc.nextDouble();

  				if(b<account.minimumAccountBalance)

  				{

  					System.out.println("Minimum balance needed to open bank Account..."+account.minimumAccountBalance);

  					break;

  				}

  				account.setBalance(b);

  				recordOfAccounts.add(account);

  			}

  			else{

  				Bank account=new Account();

  				System.out.println("enter account number");

  				account.setAccountNumber(sc.nextInt());

  				System.out.println("enter holder name");

  				account.setHolderName(sc.next());

  				System.out.println("enter balance");

  				double b=sc.nextDouble();

  				if(b<account.minimumAccountBalance)

  				{

  					System.out.println("Minimum balance needed to open bank Account..."+account.minimumAccountBalance);

  					break;

  				}

  				account.setBalance(b);

  				recordOfAccounts.add(account);

  			}

  			

  			System.out.println("Account created successfully...");

  			break;

  			

  		case 2:

  			System.out.println("enter account number");

  			int accNumber=sc.nextInt();

  			for(Bank b:recordOfAccounts){

  				

  				if(b.getAccountnumber()==accNumber)

  				{

  					

  					b.checkBalance();

  					break;

  				}

  			}

  			break;

  		case 3:

  			System.out.println("enter account number");

  			int accNumber1=sc.nextInt();

  			System.out.println("enter amount");

  			double amount=sc.nextDouble();

  			for(Bank b:recordOfAccounts){

  				if(b.getAccountnumber()==accNumber1)

  				{

  					b.deposit(amount);

  				}

  			}

  			break;

  			

  		case 4:

  			System.out.println("enter account number");

  			int accNumber11=sc.nextInt();

  			System.out.println("enter amount");

  			double amount1=sc.nextDouble();

  			for(Bank b:recordOfAccounts){

  				if(b.getAccountnumber()==accNumber11)

  				{

  					b.withdrawl(amount1);

  				}

  			}

  			break;

  			

  		case 5:

  			System.out.println("enter account number");

  			int accNumber3=sc.nextInt();

  			for(Bank b:recordOfAccounts){

  				if(b.getAccountnumber()==accNumber3 )

  				{

  					if(b instanceof SavingsAccount)

  					b.addInterest();

  					else

  						System.out.println("not a savings account...");

  				}

  			}

  			break;

  		case 6:

  			for(Bank b:recordOfAccounts){

  				System.out.println("Account Number : "+b.accountNumber+" Balance : " +b.balance+" HolderName : "+b.holderName);

  			}

  			break;

  		case 7:

  			System.exit(0);

  		}

  	}

   }

}
