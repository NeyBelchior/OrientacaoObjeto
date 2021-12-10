package oo.herancaexercicios.Desafio;

public class Ferrari extends Carro{
	
   
	
	
	public Ferrari(){
		super(300);
	
		}
	
	//quando você sobrescreve um método o java só permite que você matenha a mesma visibilidade ou aumente a visibilidade
	@Override
public void acelerar() {
		velocidadeAtual+=15;
		
	}	
	

}
