public class CheckingAccount extends Account {

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }
    
    @Override
    public boolean withdraw(double value) {
     double valueToWithdraw = value + 0.2;
    return super.withdraw(valueToWithdraw);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
        
    }
}
