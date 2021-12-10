package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
	
		
		Pessoa p1 = new Pessoa("Pedro","Amoedo",-45);
	
		p1.setIdade(200);//alterar o valor da variável
		
		System.out.println(p1.getIdade());//lemos o valor da variável
		System.out.println(p1);//to string
	
		System.out.println(p1.getNomeCompleto());
	
	}
}
