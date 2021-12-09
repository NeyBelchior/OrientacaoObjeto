package oo.herancaexercicios.Desafio;

public class Carro {
	//ou é iniciada diretamente na criação ou no mais tardar na criação do objeto
	final int VELOCIDADE_MAXIMA;
	double velocidadeAtual=1;
    int delta =5;
	
	Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA=velocidadeMaxima;
	}
	
	void acelerar () {
		if(velocidadeAtual+delta<VELOCIDADE_MAXIMA) {
			
			    velocidadeAtual=VELOCIDADE_MAXIMA;
		
		}else {
			velocidadeAtual+=delta;
		}
		
		
	}
	void frear() {
		if(velocidadeAtual>=5) {
			velocidadeAtual-=5;
		}else {
			velocidadeAtual=0;
		}
	}
  public  String toString(){
	  return "Velocidade Atual é " +velocidadeAtual +"km/h";
			  
  }

}
