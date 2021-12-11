package lambdas;

public class Produto {
	
	final String nome;
	public final Double preco;
	public final Double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal=preco*(1-desconto);
		return "Nome : " + nome +"tem preço de R$ " +precoFinal;
	}
	
	

}
