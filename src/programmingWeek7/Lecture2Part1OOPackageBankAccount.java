package programmingWeek7;

public class Lecture2Part1OOPackageBankAccount {
	
	private double balance;
	private String accountName;
	
	public void setName(String name) {
		this.accountName = name;
	}
	
	
	
	
	/**
	 * Update bank balance by adding deposit 
	 * @param deposit
	 */
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	
	/**
	 * Attempt to withdraw funds and adjust balance 
	 * Return zero if insufficient funds are available 
	 * 
	 * @param amountToWithdraw
	 * @return
	 */
	public double withdraw(double amountToWithdraw) {
		if(balance>amountToWithdraw) {
		this.balance -= amountToWithdraw;
		System.out.println("Withdrawal Successful. Thank You");
		return amountToWithdraw;
		}
		else {
			System.out.println("Insufficient funds");
			return 0;
		}
	}
	
	public double getBalance() {
		return balance;
			}
	
	public void printDetails() {
		System.out.println("****************************");
		System.out.println("Account name : "+accountName);
		// because we will get rounding errors with doubles, we want to display balance
		// to two decimal places only
		// System.out.println("Current balance : "+balance);
		System.out.printf("Current balance : %.2f %n",balance);
		System.out.println("****************************");
		System.out.println("");
		
	}
	/**
	 * Withdraw funds from passed in Bank Account and deposit in another
	 * @param amount
	 * @param fromAccount
	 */
	public void transfer(double amount, Lecture2Part1OOPackageBankAccount fromAccount) {
		this.deposit(fromAccount.withdraw(amount));
	}
	
	
}
