package oo.heranca.teste;

import oo.herancaexercicios.Direcao;
import oo.herancaexercicios.Heroi;
import oo.herancaexercicios.Monstro;

public class jogo {
	public static void main(String[] args) {
		
		Monstro monstro =new Monstro(10,10);

		
		Heroi heroi =new Heroi(10,11);

		
		
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		System.out.println("Monstro tem : "+monstro.vida +" " + "de vida");
		System.out.println("Heroi tem : "+heroi.vida+" "+"de vida");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println("Monstro tem : "+monstro.vida +" " + "de vida");
		System.out.println("Heroi tem : "+heroi.vida+" "+"de vida");
	}

}
