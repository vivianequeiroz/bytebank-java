public class TestSystem {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.setPassword(2222);
		
		Admin adm = new Admin();
		adm.setPassword(1235);
		
		Customer c1 = new Customer();
		c1.setPassword(456789);
		
		InternSystem is = new InternSystem();
		is.authenticate(m);
		is.authenticate(adm);
		is.authenticate(c1);

	}

}