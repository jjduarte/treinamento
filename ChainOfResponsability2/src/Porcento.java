
public class Porcento implements Resposta {

	private Resposta resposta;

	public Porcento(Resposta resposta){
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.PORCENTO){
			System.out.println("IMPRIME FORMATO PORCENTO");
		
		} else
			resposta.responde(req, conta);

	}

}
