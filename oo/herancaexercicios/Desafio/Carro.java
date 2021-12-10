package oo.herancaexercicios.Desafio;

public class Carro {
	//ou é iniciada diretamente na criação ou no mais tardar na criação do objeto
   public final int VELOCIDADE_MAXIMA;
   public double velocidadeAtual=1;
   private int delta =5;
	
	protected Carro(int velocidadeMaxima){
		
		VELOCIDADE_MAXIMA=velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public void acelerar () {
		if(velocidadeAtual+getDelta()>VELOCIDADE_MAXIMA) {
			
			    velocidadeAtual+=VELOCIDADE_MAXIMA;
		
		}else {
			velocidadeAtual+=getDelta();
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
