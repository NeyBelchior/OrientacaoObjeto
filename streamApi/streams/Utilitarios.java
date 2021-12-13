package streamApi.streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	 public final static  UnaryOperator<String> maiuscula = n -> n.toUpperCase();	
	 public final static  UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+"";
	 public final static String grito(String n) {
		return n +"!!!! ";
	 }
	 
 	static String stringReversa(String s) {
	    String a ="";
 		for(int i=s.length()-1;i>=0;i--) {
 			a+=s.charAt(i);
 			    }return a;
		
	
	 }
	    

}
