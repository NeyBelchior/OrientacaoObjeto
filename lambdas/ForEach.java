package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List <String> aprovados = Arrays
				.asList("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma Tradicional");
		for(String percorredor : aprovados) {
			System.out.println(percorredor);
		}
		
		System.out.println("\nLambda #01.....");
		//Para um parametro não precisa de (), e para uma sentença não precisa de chaves e o return está implícito
		aprovados.forEach(nome -> System.out.println(nome +"!!!"));
		
		System.out.println("\nMethod Reference...");
		//a diferenca desse prode cima é que o processo aqui é mais automatizado,logo, eu não consigo personalizar (colocar !!)
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02.....");
		//(nome -> meuImprimir(nome) aqui não precisa de ; pois eu estou passando um parâmetro de uma expressão lambda para o meu foreach
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference#02...");
		aprovados.forEach(ForEach::meuImprimir);
		
		
	
	
	}
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é "+ nome);}
	

}
