public class BonusController {

	private double sum;
	
	public void register(Employee e) {
		
		double bonus = e.getBonus();
		this.sum = this.sum + bonus;
	}
	
	public double getSum() {
		return sum;
	}
}
