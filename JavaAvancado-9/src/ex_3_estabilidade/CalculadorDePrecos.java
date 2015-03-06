package ex_3_estabilidade;

public class CalculadorDePrecos {

	
	private TabelaDePreco tabelaDePreco;
	private Transporte meioDeTransporte;
	public CalculadorDePrecos(Transporte meioDeTransporte, TabelaDePreco tabelaDePreco){
		this.meioDeTransporte = meioDeTransporte;
		this.tabelaDePreco = tabelaDePreco;
	}
	
	public double calcula(Compra produto) {

	        double desconto = tabelaDePreco.descontoPara(produto.getValor());
	        double frete = meioDeTransporte.para(produto.getCidade());

	        return produto.getValor() * (1-desconto) + frete;
	    }
}
