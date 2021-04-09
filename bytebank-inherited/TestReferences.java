public class TestReferences {

	public static void main(String[] args)  {
			
		Manager g1 = new Manager();
		g1.setName("Viviane");
		
		g1.setSalary(4000.0); 
		
		
		Employee f1 = new Employee();
		f1.setSalary(2000.0);
		
		VideoEditor ve1 = new VideoEditor();
		ve1.setSalary(1900.0);
		
		Designer d1 = new Designer();
		ve1.setSalary(2500.0);
		
		BonusController controller = new BonusController();
		controller.register(g1);
		controller.register(f1);
		controller.register(ve1);
		controller.register(d1);
		
		System.out.println(controller.getSum());
		
	}
}