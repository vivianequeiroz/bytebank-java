public class TestBank {

    public static void main(String[] args) {
        Customer viviane = new Customer();
        viviane.name = "Viviane Queiroz";
        viviane.profession = "intern developer";

        Account vivianeAccount = new Account();
        vivianeAccount.deposit(120);

        // composition of customer to account
        vivianeAccount.holder = viviane;

        System.out.println(vivianeAccount.holder);
        System.out.println(vivianeAccount.holder.name);
    }
}