public class TestMethod {

	public static void main(String[] args) {
		Account accountTest = new Account();
		
		accountTest.balance = 100;
		accountTest.deposit(50);
		
		System.out.println(accountTest.balance);	

        accountTest.withdrawMoney(50);
        System.out.println(accountTest.balance);

         
        Account accountTransfer = new Account();
        
        accountTransfer.deposit(1500);
        accountTransfer.transfer(500, accountTest);   

        System.out.println(accountTest.balance);
        System.out.println(accountTransfer.balance);
	}
}
