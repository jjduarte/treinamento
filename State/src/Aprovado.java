import javax.management.RuntimeErrorException;


public class Aprovado implements EstadoDeUmOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!orcamento.desconto){
			orcamento.valor -= orcamento.valor * 0.02;
			orcamento.desconto = true;
		}else {
			throw new RuntimeException("Desconto j� concedido");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� esta aprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� esta aprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
