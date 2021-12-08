package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	
	List<Compra> compras =new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		}
	
	

}
