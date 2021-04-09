public class TestAccounts {

	public static void main(String[] args) {
	
	SavingsAccount sa = new SavingsAccount(123, 123);
	sa.deposit(100.0);
		
	CheckingAccount ca = new CheckingAccount(465, 456);
	ca.deposit(100.0);
	
	ca.transfer(10.0, sa);
	System.out.println("Conta corrente: " + ca.getBalance());
	System.out.println("Conta poupança: " + sa.getBalance());
	
	}
}