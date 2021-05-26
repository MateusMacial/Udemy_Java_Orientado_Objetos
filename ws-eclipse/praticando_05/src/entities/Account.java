package entities;

public class Account {
	
	private int accountNumber;
	private String name;
	private double balance;
	

	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public Account(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5.0);
	}
	
	public String toString() {
		return "Account: "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $"
				+ balance;
	}
	
	
	
	

}
