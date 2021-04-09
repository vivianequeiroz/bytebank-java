public class TestGetSet {

    public static void main(String[] args) {

        Account account = new Account();

        account.setNumber(123);
        System.out.println(account.getNumber());

        Customer holderofAccount = account.getHolder();
        holderOfAccount.setProfession("programmer");

        System.out.println(holderofAccount);
    }
}