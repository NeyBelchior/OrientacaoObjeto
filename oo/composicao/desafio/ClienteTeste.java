package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Produto p1=new Produto("Caju",4);
		Produto p2 =new Produto("chuchu",5);
		Cliente c1=new Cliente();
		Compra comp1=new Compra();
		Compra comp2 =new Compra();
		
		comp1.adicionarItem(p1, 10);
		comp2.adicionarItem(p2, 20);
		
		
		c1.adicionarCompra(comp1);
		c1.adicionarCompra(comp2);
		
		
	System.out.println(c1.compras.size());
     double total = 0;
     
	for(Compra compras : c1.compras) {
		System.out.printf("Valores da %d compra  ",c1.compras.indexOf(compras)+1);
		System.out.println();
		for(int i=0;i<=compras.itens.size()-1;i++) {
		System.out.println(compras.itens.get(i).getProdutoNome());
		System.out.println(compras.itens.get(i).retornaPrecoProduto());	
		double fator=compras.itens.get(i).retornaPrecoProduto();
		total+=fator;
		}
		
		System.out.println(total);
		
	}
			
			
			
		}
		

	}


