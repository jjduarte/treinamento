
public class XML implements Resposta {

	private Resposta resposta;

	public XML(Resposta resposta){
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.XML){
			System.out.println("IMPRIME FORMATO XML");
		
		} else
			resposta.responde(req, conta);

	}

}
