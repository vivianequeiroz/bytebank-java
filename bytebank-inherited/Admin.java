public class Admin extends Employee implements Authenticated {

	private AuthenticatorController auth;
	
	public Admin() {
		this.auth = new AuthenticatorController();
	}
	
	@Override
	public double getBonus() {
		return 100;
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
