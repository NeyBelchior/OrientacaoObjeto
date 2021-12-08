package oo.composicao.desafio;

public class Item {
	
	Produto produto;
	int qtde;
	
	
	Item(Produto produto,int qtde){
		this.produto=produto;
		this.qtde=qtde;
		
   	}
	
	String getProdutoNome(){
		return this.produto.nome;
	}
	
	Double retornaPrecoProduto() {
		return produto.preco*this.qtde;
	}
	
	public String toString() {
		return this.produto.nome;
	}
	

	
	

}
