public class TestValues { 

    public static void main(String[] args) {

        Account account = new Account(1254, 455);

        System.out.println(account.getAgency());

        Account account2 = new Account(1548,458);
        Account account3 = new Account(1458,588);

        System.out.println(Account.getTotal());
    }
}