package entities;

public class Account {
	
	// Nao poderá ser alterado após criad, logo nao tem o metodo set
	private int numero;
	
	private String nomeTitular;
	
	// podera ser modificado apenas por saque/deposito, logo apenas o metodo get
	private double saldo; 
	
	public Account(int numero, String nomeTitular) {
		
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}

	public Account(int numero, String nomeTitular, double depositoInicial) {
		super();
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial);
	}

	
	
	public int getNumero() {
		return numero;
	}

	

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double valor) {
		
		saldo+= valor;
		
	}
	
	public void sacar (double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
	return "Conta "
			+ numero
			+ ", Nome: "
			+ nomeTitular
			+ ", Saldo: $ "
			+ String.format("%.2f", saldo );
	}
	                                   
	
	

	
	
	
	
	
	

}
