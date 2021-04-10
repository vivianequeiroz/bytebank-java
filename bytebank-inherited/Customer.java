public class Customer implements Authenticated {

	private int password;
	@Override
	public void setPassword(int password) {
		this.password = password;
		
	}

	@Override
	public boolean authenticate(int password) {
		if(this.password == password) {
			return true;
		} else { 
			return false;
		}
	}

}