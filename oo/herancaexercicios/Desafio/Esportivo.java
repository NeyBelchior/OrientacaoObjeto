package oo.herancaexercicios.Desafio;

public interface Esportivo {
	//A interface possui métodos mas esses métodos não podem ter corpo
	//Uma interface , define apenas uma necessidade de você implementar algo, quando uma classe herda de uma interface
	//Uma classe pode herdar de muitas interfaces, mas só pode herdar de uma classe
	//todo método dentro de interface é públic e abstract(um método que não tem corpo) embora não esteja explicito
	
	
//---> Uma vez que eu tenho o metodo, a classe que heradar dessa interface terá a obrigação de implementar essa método	
	void ligarTurbo();
	void desligarTurbo();
	
	

}
