package cap_3;

import java.util.Calendar;

public class Programa {
	public static void main(String[] args) {
		
		
		Historico historico = new Historico();
		Contrato c1 = new Contrato(Calendar.getInstance(), "Joao", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		Estado estadoAnterior = historico.pega(1);
		System.out.println(estadoAnterior.getEstado().getTipo());
		
		System.out.println(c1.getTipo());
        c1.restaura(historico.pega(1));
        System.out.println(c1.getTipo());
	}
}
