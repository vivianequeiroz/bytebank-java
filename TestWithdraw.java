public class TestWithdraw {

	public static void main(String[] args) {
		
		Account c1 = new CheckingAccount(123, 456);
		
		c1.deposit(200.0);
		c1.withdraw(290.0);
		
		System.out.println(c1.getBalance());
	}
}

//console:

// O total de contas é 1
// Exception in thread "main" InsufficientBalanceException: Saldo: 200.0, Valor a sacar: 290.2
// 	at Account.withdraw(Account.java:23)
// 	at CheckingAccount.withdraw(CheckingAccount.java:11)
// 	at TestWithdraw.main(TestWithdraw.java:9)

//unchecked!