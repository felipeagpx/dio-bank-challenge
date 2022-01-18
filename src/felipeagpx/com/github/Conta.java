package felipeagpx.com.github;

public abstract class Conta implements ContaInterface {
	
	private static final String AG_PADRAO = "0001";
	private static int SEQUENCIAL = 1;
	
	private String agencia;
	private int numConta;
	private double saldo;
	
	public Conta() {
		this.agencia = AG_PADRAO;
		this.numConta = SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		
		this.saldo -= valor;	
		
	}

	@Override
	public void depositar(double valor) {
		
		this.saldo += valor;
			
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	@Override
	public void imprimeExtrato() {
		
	}
	
	protected void imprimeDados () {
		
		System.out.println(String.format("Agência: %s",this.agencia));
		System.out.println(String.format("Conta: %d",this.numConta));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
		
	}
	
}