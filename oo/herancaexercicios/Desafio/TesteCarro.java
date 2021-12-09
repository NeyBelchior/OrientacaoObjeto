package oo.herancaexercicios.Desafio;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro ferrari=new Ferrari();
		Carro civic =new Civic();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.acelerar();
		civic.acelerar();
		System.out.println(ferrari);
		System.out.println(civic);
		
	
		

	}

}
