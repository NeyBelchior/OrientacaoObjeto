package oo.heranca.teste;

import oo.herancaexercicios.Desafio.Carro;
import oo.herancaexercicios.Desafio.Civic;
import oo.herancaexercicios.Desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Ferrari ferrari=new Ferrari();
		Carro civic =new Civic();
		System.out.println(ferrari.VELOCIDADE_MAXIMA);
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		ferrari.ligarTurbo();
		ferrari.acelerar();
		civic.acelerar();
		System.out.println(ferrari);
		System.out.println(civic);
		
		
	
		

	}

}
