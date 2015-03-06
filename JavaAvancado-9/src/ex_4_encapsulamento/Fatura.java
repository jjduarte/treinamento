package ex_4_encapsulamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Fatura {
	private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

	public void adicionaPagamento(Pagamento p) {
		this.pagamentos.add(p);
		
		if(valorTotalDosPagamentos() > this.valor){
			this.pago = true;
		}
		
	}

	private double valorTotalDosPagamentos() {
		double totalPago = 0;
		for (Pagamento pagamento : pagamentos) {
			valor += pagamento.getValor();
		}
		return totalPago;
	}

}
