package oo.composicao.desafioFeitoProfessor;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 =new Compra();
		compra1.adicionarItem("Caneta",9.67,100);
		compra1.adicionarItem(new Produto("NoteBook",1897.88),2);
		
		Compra compra2 =new Compra();
		compra2.adicionarItem("Caderno",10,100);
		compra2.adicionarItem(new Produto("Impressora",998.90),1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.printf("O cliente %s comprou : %f \n",cliente.nome,cliente.obterValorTotal());
		
		

	}

}
