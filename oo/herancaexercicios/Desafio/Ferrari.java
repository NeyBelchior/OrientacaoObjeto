package oo.herancaexercicios.Desafio;

public class Ferrari extends Carro{
	
   static final int VELOCIDADE_MAXIMA=300;
	
	
	Ferrari(){
		super(VELOCIDADE_MAXIMA);
	
		}
	
	
	@Override
	void acelerar() {
		velocidadeAtual+=15;
		
	}	
	

}
