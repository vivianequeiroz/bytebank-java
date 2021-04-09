public class TestEmployee {

	public static void main(String[] args) {
		
		Employee viviane = new Employee();
		
		viviane.setName("Viviane Queiroz");
		viviane.setCpf("123456789");
		viviane.setSalary(2200);
		
		System.out.println(viviane.getName());
		System.out.println(viviane.getBonus());
	}

}
