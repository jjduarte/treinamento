
public class Positivo implements StatusDaConta{

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		if(conta.saldo < 0) 
			conta.status = new Negativo();
		
	}

}
