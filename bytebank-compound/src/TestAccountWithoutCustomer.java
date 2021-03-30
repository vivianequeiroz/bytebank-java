public class TestAccountWithoutCustomer {

    public static void main(String[] args) {
        Account accountWithoutCustomer = new Account();
        System.out.println(accountWithoutCustomer.balance);

        // direct composition of customer and account
        accountWithoutCustomer.holder = new Customer();
        System.out.println(accountWithoutCustomer.holder);

        accountWithoutCustomer.holder.name = "João";
        System.out.println(accountWithoutCustomer.holder.name);
    }
}