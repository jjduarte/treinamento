
public class TesteFormatador {

	public static void main(String[] args) {
		Formatador formatador = new Formatador();
		
		Conta c1 = new Conta("Joao", 1000.0);
		Requisicao r1 = new Requisicao(Formato.XML);
		Conta c2 = new Conta("Maria", 100.0);
		Requisicao r2 = new Requisicao(Formato.CSV);
		
		
		formatador.formata(r1, c1);
		formatador.formata(r2, c2);
	}
}
