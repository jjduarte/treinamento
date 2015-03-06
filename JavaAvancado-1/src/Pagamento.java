import java.util.Calendar;


public class Pagamento {
	private String nome; 
	private Documento documento;
	private double valor;
	
	public String getNome() {
		return nome;
	}
	public void setPagador(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		// TODO Auto-generated method stub
		return null;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumentoPagador(Documento documento) {
		this.documento = documento;
	}
	
	
}
