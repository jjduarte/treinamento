import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;


public class Pagamentos implements Iterable<Pagamento>{
	private double valorPago;
	private Collection<Pagamento> pagamentos = new ArrayList<>();
	public Collection<Pagamento> pagamentosAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public Collection<Pagamento> pagamentoComValorMaiorQue(double valorMinimo){
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if(pagamento.getValor() > valorMinimo){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public Collection<Pagamento> pagamentosDo(String cnpjPagador){
		Collection<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for (Pagamento pagamento : this) {
			if(pagamento.getDocumento().getValor().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public double getValorPago() {
		return valorPago;
	}
	
	private void paga (double valor){
		if(valor < 0){
			throw new IllegalArgumentException("Valor invalido para pagamento");
		}
		
		if(valor > 100){
			valor = valor - 8;
		}
		this.valorPago += valor;
	}
	
	public void registra(Pagamento pagamento) {
        double valor = pagamento.getValor();
        if (valor < 0) {
          throw new IllegalArgumentException("Valor invalido para pagamento");
        }
        if (valor > 100) {
          valor = valor - 8;
        }
        this.valorPago += valor;
        this.pagamentos.add(pagamento);
      }
	
	public boolean foiRealizado(Pagamento pagamento){
		return pagamentos.contains(pagamento);
	}

	@Override
	public Iterator<Pagamento> iterator() {
		return pagamentos.iterator();
	}
	

}
