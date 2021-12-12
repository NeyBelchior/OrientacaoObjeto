package lambdas.desafio;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.Produto;

public class DesafioResolucaoProfessor {
	
	public static void main(String[] args) {
		//Produto p = new Produto("ipad", 3235.89, 0.13);
	// O java não permite que eu tenha uma varável ja definada dentro do meu algoritimo já definida que tenha exatamente o mesmo nome do parametro
	//de uma lambda function
		
		
		Function<Produto, Double> precoFinal=
				produto->produto.preco*(1-produto.desconto);
		
		UnaryOperator<Double>impostoMunicipal=
		preco-> preco>= 2500 ? preco*1.085  : preco;
        
	    UnaryOperator<Double>frete=
	    preco-> preco>= 3000 ? preco+100 : preco+50;
       
	    UnaryOperator<Double>arredondar=
	    preco ->Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", preco));
        
	    Function<Double, String>formatar=
	    preco ->("R$" +preco).replace(".", ",");		
    	Produto p = new Produto("ipad", 3235.89, 0.13);
        String preco =precoFinal
        		.andThen(impostoMunicipal)
        		.andThen(frete)
        		.andThen(arredondar)
        		.andThen(formatar)
        		.apply(p);
        
        System.out.println("O preço final é "+preco);
   
		
	}

}
