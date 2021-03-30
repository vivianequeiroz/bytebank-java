public class TestNegativeWithdraw {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(120);

        System.out.println(account.withdrawMoney(121));

        account.withdrawMoney(121);

        System.out.println(account.getBalance());
    }
}