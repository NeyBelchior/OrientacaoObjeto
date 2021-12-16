package tratamentoDeErros;

public class ChecadaXNaoChecada {
	public static void main(String[] args) {
	try {
		geraerro1();
	} catch (RuntimeException e) {
		System.out.println(e.getMessage());
		
	}
	try {
		geraerro2();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	System.out.println("Fim");	
	}
	
	//Não checada /não verificada unchecked
	static void geraerro1() {
	//nao basta instancia um erro , eu preciso lança-lo com throw
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	//Verificado /checked
static void geraerro2() throws Exception{
	throw new Exception("Ocorreu um erro bem legal #02");
	//como é checada eu sou obrigado a informar na assinatura do método que eu lanço essa execenção 
	//posso tratar ela direto aqui, ou em cada chamada do método 
	}

}
