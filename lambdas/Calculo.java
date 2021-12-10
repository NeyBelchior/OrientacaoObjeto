package lambdas;
@FunctionalInterface
//eu só posso definir um metodo dentro de uma interface funcional
//salvo metodo static e o default*****
public interface Calculo {
     
  /*public abstract ja vem implicito lembrar**/ 
	double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitolegal() {
		return "muito legal";
	}
	
}
