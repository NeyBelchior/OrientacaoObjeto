package tratamentoDeErros.personalizada;

@SuppressWarnings("serial")
public class StringVaziaExepetion extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public StringVaziaExepetion(String nomeDoAtributo) {
		this.nomeDoAtributo=nomeDoAtributo;
		
		
	}
	

	public String getMessage() {
	
		return String.format("O atributo %s está  vazio ", nomeDoAtributo);
	}
	
	

}
