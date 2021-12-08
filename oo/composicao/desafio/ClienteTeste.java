package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		Produto p1=new Produto("Caju",4);
		Produto p2 =new Produto("chuchu",5);
		Cliente c1=new Cliente();
		Compra comp1=new Compra();
		Compra comp2 =new Compra();
		
		comp1.adicionarItem(p1, 10);
		comp1.adicionarItem(p2, 50);
		comp2.adicionarItem(p2, 20);
		
		
		c1.adicionarCompra(comp1);
		c1.adicionarCompra(comp2);
		
		
	System.out.println(c1.compras.size());

   
		
	System.out.println(c1.retornaValorTotal());
		
	}
			
			
			
		}
		




