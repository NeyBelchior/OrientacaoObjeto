package oo.herancaexercicios;

public class Heroi extends Jogador{
	
	
	
	Heroi(int x,int y){
		super(x,y);
	}
	
      boolean atacar(Jogador oponente) {
    	  
    	  
	
    	boolean ataq1=  super.atacar(oponente);
    	boolean ataq2=  super.atacar(oponente);
    	boolean ataq3=  super.atacar(oponente);
       
    	return ataq1 || ataq2||ataq3;
      }
	
	
	

}
