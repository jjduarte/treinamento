
public class TesteDeInvestimentos {

	public static void main(String[] args) {
		Conta conta1 = new Conta(100.00);
		Conta conta2 = new Conta(100.00);
		Conta conta3 = new Conta(100.00);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimentos broker = new RealizadorDeInvestimentos();
		
		broker.realizaCalculo(conta1, conservador);
		broker.realizaCalculo(conta2, moderado);
		broker.realizaCalculo(conta3, arrojado);
		
	}
	
	
}
