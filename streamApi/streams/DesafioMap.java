package streamApi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

import lambdas.ForEach;

//123

public class DesafioMap {
	
	public static void main(String[] args) {
	
		
		
		List<Integer> nums =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<Integer> print = System.out::println;
		
		
		nums.stream()
		.map(n -> Integer.toBinaryString(n))
		.map(n ->Utilitarios.stringReversa(n))
		.map(n ->Integer.parseUnsignedInt(n, 2))
		.forEach(print);
		
		

		
	
		
	
	

			
		
		/*1- Número  para  string binária ....6=>"110"
		 *2-inverter a String ..... "110"=> "011" 
		 *3- Converter de volta  para inteiro =>"011" =>3
		 * 
		 * 
		 * 
		 * */
	
	
	

	
  
	
	
	
		
		
		
	
}
}
