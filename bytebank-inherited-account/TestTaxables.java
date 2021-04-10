public class TestTaxables {

	public static void main(String[] args) {
		
		CheckingAccount ca = new CheckingAccount(123,456);
		ca.deposit(100.0);
		
		
		LifeInsurance la = new LifeInsurance();
		
		TaxCalculator calc = new TaxCalculator();
		
		calc.register(ca);
		calc.register(la);
		
		System.out.println(calc.getTotalTax());
	}

}