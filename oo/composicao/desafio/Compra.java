package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	Item item;
	
	List<Item> itens = new ArrayList<>();
	
	
	
	void adicionarItem(Produto produto,int qtde) {
		this.itens.add(new Item(produto, qtde));
		}
	
	
	
	
	

}
