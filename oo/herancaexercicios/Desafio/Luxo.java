package oo.herancaexercicios.Desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarArcondicionado();
	
	
	default int velocidadeDoAr(){
		return 1;
	}

}
