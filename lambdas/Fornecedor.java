package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		//como eu não sou obrigado a passar nenhum parâmeto vai () faz parte da sintaxe
		Supplier<List<String>> umLista=
				() ->Arrays.asList("Ana","Bia","Lia","Gui");
		
				
				
		System.out.println(umLista.get());
		
	}

}
