public class CheckingAccount extends Account implements Taxable {

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

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
