package oo.herancaexercicios.Desafio;

public class Carro {
	//ou é iniciada diretamente na criação ou no mais tardar na criação do objeto
   public final int VELOCIDADE_MAXIMA;
   public double velocidadeAtual=1;
   protected int delta =5;
	
	protected Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA=velocidadeMaxima;
	}
	
	public void acelerar () {
		if(velocidadeAtual+delta<VELOCIDADE_MAXIMA) {
			
			    velocidadeAtual=VELOCIDADE_MAXIMA;
		
		}else {
			velocidadeAtual+=delta;
		}
		
		
	}
	public void frear() {
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
