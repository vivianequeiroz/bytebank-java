public class InternSystem {
	
	private int password = 2222;

	public void authenticate(Authenticated ae) {
		
		boolean authenticated = ae.authenticate(this.password);
		if(authenticated) {
			System.out.println("Login realizado com sucesso!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
