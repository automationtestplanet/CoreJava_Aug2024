package enums;

public class BankTransactions {

	static int balance = 0;

	public void deposit(AccountType accountType, int depositAmount) {

		switch (accountType) {
		case SAVINGS:
			if (depositAmount <= 200000)
				balance += depositAmount;
			else
				System.out.println("Deposit more than 200000 for SAVINGS Account not allowed");

			break;
		case RETAIL:
			if (depositAmount <= 1000000)
				balance += depositAmount;
			else
				System.out.println("Deposit more than 1000000 for RETAIL Account not allowed");
			break;
		case CURRENT:
			if (depositAmount <= 2000000)
				balance += depositAmount;
			else
				System.out.println("Deposit more than 2000000 for CURRENT Account not allowed");
			break;
		default:
			break;
		}

	}

	public void withdrawl(AccountType accountType, int withdrawlAmount) {

		switch (accountType) {
		case SAVINGS:
			if (withdrawlAmount <= 50000) {
				if (balance > withdrawlAmount) {
					balance = balance - withdrawlAmount;
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Daily withdrawl limit for SAVINGS account 50000 only");
			}
			break;
		case RETAIL:
			if (withdrawlAmount <= 20000) {
				if (balance > withdrawlAmount) {
					balance = balance - withdrawlAmount;
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Daily withdrawl limit for RETAIL account 200000 only");
			}
			break;
		case CURRENT:
			if (withdrawlAmount <= 1000000) {
				if (balance > withdrawlAmount) {
					balance = balance - withdrawlAmount;
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Daily withdrawl limit for CURRENT account 1000000 only");
			}
			break;
		default:
			break;
		}
	}

	public void displayBalance() {
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {
		BankTransactions sbiBank = new BankTransactions();
		sbiBank.deposit(AccountType.SAVINGS,100000);
		sbiBank.displayBalance();

		BankTransactions icicBank = new BankTransactions();
		icicBank.withdrawl(AccountType.SAVINGS,5000);
		icicBank.displayBalance();

		icicBank.withdrawl(AccountType.SAVINGS,105000);

	}

}
