public class TestMethod {

	public static void main(String[] args) {
		Account accountTest = new Account();
		
		accountTest.balance = 100;
		accountTest.deposit(50);
		
		System.out.println(accountTest.balance);	
	}
}
