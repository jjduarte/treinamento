package cap_5;

public class RaizQuadrada implements Expressao{

	Expressao valor;
	
	
	public RaizQuadrada(Expressao valor) {
		this.valor = valor;
	}
	
	@Override
	public int avalia() {
		int valorExpressao = valor.avalia();
		return (int) Math.sqrt(valorExpressao);
	}

	public Expressao getValor() {
		return valor;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaRaiz(this);
		
	}
	
	
	
}
