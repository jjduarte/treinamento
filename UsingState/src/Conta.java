
public class Conta {
	protected double saldo;
	protected StatusDaConta status;
	
	public Conta (double saldo){
		this.saldo = saldo;
		if(saldo > 0 ){
			status = new Positivo();
		} else {
			status = new Negativo();
		}
		
	}
	
	
	public void deposita(double valor){
		status.deposita(this, valor);
	}
	
	public void saca(double valor){
		status.saca(this, valor);
	}


}
