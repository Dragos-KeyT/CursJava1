package curs11.package1;

 public abstract class Account {

	public abstract void deposit(double amount) throws InvalidAmountException;
	public abstract void withdraw(double amount) throws InvalidAmountException, InsufficentFundsException;
	public abstract void checkBalance();

	
	
}
