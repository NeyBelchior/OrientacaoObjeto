package lambdas;

public class InterfacesFuncionaisTeoriaResumo {
    //Legenda T,S types tipos > temos um pacote especial para os tipos primitivos que não é o tratado aqui
	/*Assinatura             ------------      Nome
	 * 
	 * nada -> T                             Supplier
	 * T    ->nada                           Consumer
	 * T    ->T                              UnaryOperator
	 * T,T  ->T                              BinaryOperator
	 * S    ->T                              Function
	 * T    ->Boolean                        Predicate
	 * 
	 * 
	 * Eu posso encadear uma função desde que a saída de uma função seja compatível com o parâmetro da outra função , isso é comum no cenario "function"
	 * Por exemplo :
	 * Data>num --> num>prod --->prod>cliente -->cliente > Boolean
	 * 
	 * 
	 * ------------Interfaces para tipos primitivos-------
	 * Dobule a =3;
	 * 
	 * Isso nãoé permitido , pois, em outras palavras eu estou tentantado converter um tipo primitivo 3(literal inteiro recebe int) para uma classe
	 * 
	 * int>double não pode
	 * Double >double pode =) o java chama de boxing (quando um primitivo vai dentro de uma clase) unboxing(quando um classe vai dentro de um primitivo)
	 *Somente para tipos do mesmo tipo  , esse processo automático é chamado de autoboxing
	 *
	 *Por isso as vezes é melhor usar uma interface, por exemplo:
	 *intBinaryOperator
	 *longBinaryOperator
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
}
