package lambdas;

public class Calculoteste3 {
	public static void main(String[] args) {
		
	
		Calculo calc =(x,y) ->{return x+y;};
		Calculo calc1 =(x,y) ->{double a = x+y;return a;};
		
		System.out.println(calc.executar(2, 3));
		
		calc=(x,y) -> x*y;//quando eu não coloco as chaves aquilo que eu declarei depois do -> será automaticamente retornado
		                  //implicitamente existe um return associado a essa expressão "x*y"
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitolegal());
}}
