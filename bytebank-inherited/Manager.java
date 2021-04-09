public class Manager extends Employee {
	
	private int password;

	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean authenticate(int password) {
		if(this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonus() {
		return super.getBonus() + super.getSalary();
	}
}