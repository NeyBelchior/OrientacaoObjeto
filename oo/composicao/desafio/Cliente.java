package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	
	List<Compra> compras =new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		}
	double retornaValorTotal() {
		Cliente c=this;
		double total=0;
	
		for(Compra percorredor : c.compras) {			
			for(int i=0;i<=percorredor.itens.size()-1;i++) {
			double fator=percorredor.itens.get(i).retornaPrecoProduto();
			total+=fator;
			}
			
		}
	
		return total;
}
	

}
