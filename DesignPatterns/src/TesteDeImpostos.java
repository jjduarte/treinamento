
public class TesteDeImpostos {

	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento (50.0);
		Orcamento orcamento2 = new Orcamento (1000.0);
		Orcamento orcamento3 = new Orcamento (8000.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
		calculador.realizaCalculo(orcamento2, iccc);
		calculador.realizaCalculo(orcamento3, iccc);
		
		
	}
}
