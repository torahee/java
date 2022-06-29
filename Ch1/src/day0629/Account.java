package day0629;

public class Account {
	
	String accountNo, ownerName;
	int balance;
	
	public Account(String accountNo,String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		
	}
	
	//예금
	void deposit(int amt) {
		balance += amt;
	}
	
	//출금
	void withdraw(int amt) {
		balance -= amt;
	}
	void widthdraw() {
		balance -= 1000;
	}
	//조회
	int balance() {
		return balance;
	}
}