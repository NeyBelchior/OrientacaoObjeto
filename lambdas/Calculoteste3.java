package lambdas;

import java.util.function.BinaryOperator;

public class Calculoteste3 {
	public static void main(String[] args) {
		
	    //Não int>double
		//double>int
		//Double a =1.0>um double primitivo para Double (classe warapper)
		
		             /*para tipos genricos só é suportado classes*/
		BinaryOperator<Double> calc =(x,y) ->{return x+y;};
		Calculo calc1 =(x,y) ->{double a = x+y;return a;};
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc=(x,y) -> x*y;//quando eu não coloco as chaves aquilo que eu declarei depois do -> será automaticamente retornado
		                  //implicitamente existe um return associado a essa expressão "x*y"
		System.out.println(calc.apply(2.0,3.0));
		
		
		
		
		BinaryOperator<Integer> calc2 =(x,y) ->{return x+y;};
		BinaryOperator<Integer> calc3 =(x,y) ->x+y;
		Calculo calc4 =(x,y) ->{double a = x+y;return a;};
		
		System.out.println(calc2.apply(2, 3));
		
		calc=(x,y) -> x*y;
		                  
		System.out.println(calc.apply(2.0,3.0));
		
}}
