package oo.composicao;

public class Motor {
	
	final Carro carro;
	
	Motor(Carro carro){
		this.carro=carro;
	}
    
	
	boolean ligado =false;
	
	double fatorDeInjecao=1;

	int giros() {
		if(!ligado) {
			return 0;
		}else {
		return (int) Math.round(fatorDeInjecao*3000);
	}
		}
	
}
