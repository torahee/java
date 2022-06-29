package day0629;

public class bank {
	public static void main(String[] args) {
		//계좌를 생성하고 입출금 및 잔액조회 연습해보기
		
		Account ac1 = new Account("0225", "서대길", 2000);
		ac1.deposit(5000);
		System.out.println("대길이의 현재 잔액: "+ac1.balance());
		ac1.withdraw(3000);
		System.out.println("대길이의 현재 잔액: "+ac1.balance());
		
		System.out.println("******************");
		//3명의 계좌를 추가 개설해서 입출해보세요
		
		Account ac2 = new Account("0330", "김건부", 3000);
		ac2.deposit(5000);
		System.out.println("건부의 현재 잔액: "+ac2.balance());
		ac2.withdraw(3000);
		System.out.println("건부의 현재 잔액: "+ac2.balance());
		
		System.out.println("******************");

		Account ac3= new Account("0901", "전정국", 10000);
		ac3.deposit(2000);
		System.out.println("정국의 현재 잔액: "+ac3.balance());
		ac3.withdraw(2000);
		System.out.println("정국의 현재 잔액: "+ac3.balance());
	}

}