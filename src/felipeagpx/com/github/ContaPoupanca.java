package felipeagpx.com.github;

public class ContaPoupanca extends Conta{
	
	@Override
	public void imprimeExtrato() {
		System.out.println("=======EXTRATO DA CONTA POUPAN�A=======");
		super.imprimeDados();
	}

}
