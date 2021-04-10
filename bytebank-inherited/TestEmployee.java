public class TestEmployee {

	public static void main(String[] args) {
		
		Manager viviane = new Manager();
		
		viviane.setName("Viviane Queiroz");
		viviane.setCpf("123456789");
		viviane.setSalary(2200);
		
		System.out.println(viviane.getName());
		System.out.println(viviane.getBonus());
	}

}