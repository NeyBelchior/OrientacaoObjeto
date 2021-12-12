package streamApi.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu","Gui","Luca","Ana");
		
		
	  for (int i = 0; i < aprovados.size(); i++) {
		System.out.println(aprovados.get(i));
	}
	  
	  System.out.println("Usando o foreach");
	  for(String percorredor : aprovados) {
		  
		  System.out.println(percorredor);
	  }
	  //Iterator é uma interface do javas que ela tem 2 métodos que retornam valores true or false ; "Tem próximo?"
	  //Iteração quer dizer repetição 
	  System.out.println("\nUsando interator");
	  
	  Iterator<String> it = aprovados.iterator();
	  
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
	  //Um conjunto de objeto com a característica, é que a iteração ocorre de forma interna e outras também sem a necessidade de explicitar
	 //stream é uma sequencia de dados, que pode ser do tipo produto do tipo string e etc , definido apartir do gernerics
	  System.out.println("\nUsando Stream...");
	 Stream<String> stream =aprovados.stream();
	 stream.forEach(System.out::println);
	 
	 
	  
	
	  
	  
	  
	  
	  
	  
		
	}
	
}
