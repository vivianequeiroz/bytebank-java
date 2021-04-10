public abstract interface Authenticated {

	public abstract void setPassword(int password);
	
	public abstract boolean authenticate(int password);
}