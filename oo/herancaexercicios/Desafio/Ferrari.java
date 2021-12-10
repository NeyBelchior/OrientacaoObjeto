package oo.herancaexercicios.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
   
	public boolean ligarTurbo;
	public boolean ligarAr;
	
	public Ferrari(){
		super(315);
	
		}
	public Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
		
	}
	
	//quando você sobrescreve um método o java só permite que você matenha a mesma visibilidade ou aumente a visibilidade

		
	
	@Override
	public void ligarTurbo(){
      ligarTurbo= true;
		
	}
	@Override
	public void desligarTurbo() {
		ligarTurbo=false;
		
		
	}
	@Override
	public void ligarAr() {
		ligarAr=true;
		
	}
	@Override
	public void desligarArcondicionado() {
		
       ligarAr=false;	
	}
	
	@Override
	public int getDelta() {
	if(ligarTurbo && !ligarAr) {
		return 35;
	}else if(ligarTurbo && ligarAr) {
		return 30;
	}else if(!ligarTurbo && !ligarAr) {
		return 20;
	}else
	
		return 15;
	}
	
	
	

}
