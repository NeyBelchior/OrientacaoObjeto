package oo.herancaexercicios.Desafio;

public class Carro {
	
	double velocidadeAtual=1;
	int fatorDeAceleracao=2;
	
	void acelerar () {
		velocidadeAtual+=5;
		
		
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
