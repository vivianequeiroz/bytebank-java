public class Manager extends Employee implements Authenticated {
	
	private AuthenticatorController auth;
	
	public Manager() {
		this.auth = new AuthenticatorController();
	}
	
	public double getBonus() {
		return super.getSalary();
	}

	@Override
	public void setPassword(int password) {
		this.auth.setPassword(password);
		
	}

	@Override
	public boolean authenticate(int password) {
		return this.auth.authenticate(password);
	}

}
