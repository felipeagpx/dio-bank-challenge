package felipeagpx.com.github;

public class ContaCorrente extends Conta {
	
	@Override
	public void imprimeExtrato() {
		System.out.println("=======EXTRATO DA CONTA CORRENTE=======");
		super.imprimeDados();
	}

}
