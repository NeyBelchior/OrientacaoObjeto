package oo.composicao.desafioFeitoProfessor;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	
	final List<Compra> compras =new ArrayList<>();
	
	Cliente(String nome){
		this.nome=nome;
	}
	

	Double obterValorTotal() {
		double total =0;
		for(Compra compra : compras) {
			total+=compra.obterValorTotal();
		}
		return total;
	}
}
