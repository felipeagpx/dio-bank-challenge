package felipeagpx.com.github;

public class Programa {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
				
		cc.depositar(1500);
		cc.imprimeExtrato();
		cp.imprimeExtrato();
		cc.transferir(500, cp);
		cc.imprimeExtrato();
		cp.imprimeExtrato();

	}

}
