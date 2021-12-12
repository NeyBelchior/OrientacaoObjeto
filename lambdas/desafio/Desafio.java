package lambdas.desafio;

import java.util.function.BiFunction;
import java.util.function.Function;

import lambdas.Produto;

public class Desafio {
	
	public static void main(String[] args) {
		Produto p = new Produto("ipad", 3235.89, 0.13);
		
		/*1.A partir do produto  calcular o preco real (com desconto)
		 *2.Imposto Municipal : >= 2500 (8.5%)/<2500(isento)
		 *3.Frete >= 3000(100)/<3000(50)
		 *4.Arredondar: Deixar duas casas decimais
		 *5.Formatar: 1234,56
		 
		  */
	
		
	BiFunction<Double,Double,Double> precoReal = 
			(PrecoDoProduto,DescontoDoProduto) ->PrecoDoProduto*(1-DescontoDoProduto);
				
	Function<Double,Double> impostoMunicipal =
			 (valorPassado)->valorPassado>=2500 ?  valorPassado*1.85:valorPassado;		
	
	Function<Double,Double> acrescentaFrete =
				(valorPassado)->valorPassado>3000 ?  valorPassado+100:valorPassado+50;
	
	Function<Double,Long> arredondarValor =
				(valorPassado)->Math.round(valorPassado);
	
    Function<Long,String> formatarTexto =
						(valorPassado)->"R$ "+valorPassado;
		 
	String alo =precoReal.andThen(impostoMunicipal).andThen(acrescentaFrete).andThen(arredondarValor).andThen(formatarTexto).apply(p.preco,p.desconto);
	
	System.out.println(alo);
			
			 
			

				 
		
			
		    	 
	
			 

	}
}
