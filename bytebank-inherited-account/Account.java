public abstract class Account {
	
    protected double balance;
    private int agency;
    private int number;
    private Customer holder;
    private static int total = 0;

    public Account(int agency, int number){
        Account.total++;
        System.out.println("O total de contas é " + Account.total);
        this.agency = agency;
        this.number = number;
//        this.balance = 100;
//        System.out.println("Estou criando uma conta " + this.number);
    }

    public abstract void deposit(double value);

    public void withdraw(double value) {
    	
        if(this.balance < value) {
          throw new InsufficientBalanceException("Saldo: " + this.balance + ", Valor a sacar: "  + value);
        }
        
        this.balance -= value;
    }

    public void transfer(double value, Account destination) {
        this.withdraw(value);
        destination.deposit(value);
    }
    
    public double getBalance(){
        return this.balance;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        if(number <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.number = number;
    }

    public int getAgency(){
        return this.agency;
    }

    public void setAgency(int agency){
       if(agency <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agency = agency;
    }

    public void setHolder(Customer holder){
        this.holder = holder;
    }

    public Customer getHolder(){
        return this.holder;
    }

    public static int getTotal(){
        return Account.total;
    }

}

