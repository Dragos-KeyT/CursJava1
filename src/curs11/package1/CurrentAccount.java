package curs11.package1;

public class CurrentAccount extends Account{

	public double balance;
	
	
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		
		if(amount > 0) {
			balance = balance + amount;
		}else {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		
		
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficentFundsException {

		if(amount > 0) {
			if(amount < balance) {
				balance = balance - amount;
			}else {
				throw new InsufficentFundsException("You dont have sufficent funds!");
			}
		}else {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		

		
	}

	@Override
	public void checkBalance() {
		System.out.println("Current balance is :" + balance);
	}

}
