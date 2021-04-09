public class TestManager {

	public static void main(String[] args) {
		
		Manager g1 = new Manager();
		
		g1.setName("João");
		g1.setCpf("123456123");
		g1.setSalary(5500.0);
		
		System.out.println(g1.getName());
		
		g1.setPassword(123);
		
		boolean authenticated = g1.authenticate(123);
	
		System.out.println(authenticated);
		
		System.out.println(g1.getBonus());
		
	}
}
