
public class Cnpj implements Documento{

	private String valor;
	
	public Cnpj(String valor) {
		this.valor = valor;
	}

	public boolean ehValido(){
		return primeiroDigitoVerificador() == primeiroDigitoCorreto() 
				&& segundoDigitoVerificador() == segundoDigitoCorretoParaCnpj();
	}

	private Object segundoDigitoCorretoParaCnpj() {
		// TODO Auto-generated method stub
		return 2;
	}

	private Object segundoDigitoVerificador() {
		// TODO Auto-generated method stub
		return 2;
	}

	private Object primeiroDigitoCorreto() {
		// TODO Auto-generated method stub
		return 1;
	}

	private Object primeiroDigitoVerificador() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return this.valor.hashCode(); // delegamos a geracao do hashCode da classe Cnpj para seu atributo String valor
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cnpj)) {
            return false;
        } 
        Cnpj outro = (Cnpj) obj;
        return this.valor.equals(outro.valor); // delegamos a comparação de dois Cnpj para seus atributos valor

	}
	
	
	@Override
	public String toString() {
		return this.valor;
	}
}
