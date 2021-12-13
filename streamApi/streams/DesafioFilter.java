package streamApi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
public static void main(String[] args) {
	Produto p1 = new Produto("Lápis",1.99,0.12,30);
	Produto p2 = new Produto("Borracha",20,0.15,0);
	Produto p3 = new Produto("caneta",20,.5,0);
	Produto p4 = new Produto("caderno",30,0.80,0);
	Produto p5 = new Produto("papel",5,0.12,30);
	Produto p6 = new Produto("apontador",1.99,0.12,30);
	Produto p7 = new Produto("clips",1.99,0.12,30);

	List<Produto> produto = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	
	//filter,filter, map
	Predicate<Produto> descontoMaiorQue30 = x ->x.Desconto>0.30;
	Predicate<Produto> qualificado = x ->x.valorFrete==0;
	Function<Produto, String> superPromocao =x ->x.nomeDoProduto +"Super Promoção";
	
	produto.stream()
	.filter(descontoMaiorQue30)
	.filter(qualificado)
	.map(superPromocao)
	.forEach(System.out::println);

}
}
