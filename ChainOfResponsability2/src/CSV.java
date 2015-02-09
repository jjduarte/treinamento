
public class CSV implements Resposta {

	private Resposta resposta;

	public CSV(Resposta resposta){
		this.resposta = resposta;
	}
	
	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV){
			System.out.println("IMPRIME FORMATO CSV");
		
		} else
			resposta.responde(req, conta);
	}

}
