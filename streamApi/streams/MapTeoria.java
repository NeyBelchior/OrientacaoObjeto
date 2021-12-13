package streamApi.streams;

public class MapTeoria {
	
	/*
	 * Serve para transforma uma stream em outra stream e o metodo que passo para ele é exatamente a função que 
	 * recebe esse elemento e transforma esse elemento para uma Stream de MESMO TAMANHO só que com todos elementos transformados
	 * Imagenemos uma stream de dados e esses dados serão processados a medida que essa stream for consumida
	 * 
	 * 3 1 7 4 6 6 8 10 9
	 * 
	 * E eu quero aplicar uma transformação aplicando um método map
	 * 
	 * No map você define uma função para ele, uma lambada expression ou uma referência para um metodo e ele vai usar essa função
	 * para transformar cada um dos  elementos de tal forma que será gerado uma outra stream exatamento do mesmo tamanho :
	 * 
	 * você vai usar  uma função para o map que será  responsável por mapear o elemento original no elemento que você quer gerarna nova stream
	 * 
	 * por exemplo  Map (e ->e*2)
	 * 
	 * Internamente ele já vai aplicar o laço e vai aplicar essa função pegando o valor original e gerar cada elemento novo
	 * seguinte essa forma de tranformação "e*2"
	 * 
	 * O map é verda uma função que vai me ajudar a transformar uma stream de dados em uma outra stream de dados do mesmo tamanho so que com dados tranformados(mapeados)
	 * a regra é exatamente a função que vou usar para transforma	
	 *
	 *6 2 14 8 12 12 16 20 18
	 *
	 * eu posso aplicar quantos métodos eu quiser aplicar em senquencia já que o resultado de um map como sendo uma operação intermediaria gera um outro stream
	 * 
	 * map(e -> e-2)
	 * 
	 * 0 12 6 10 10 14 18 16
	 * 
	 * 
	 * Por exemplo eu tenho array de 4 posições e nele eu tenho um objeto
	 * 
	 * obj(nome,preco) obj(nome,preco) obj(nome,preco) obj(nome,preco)
	 * 
	 * 
	 * como que eu poderia fazer um map para extrair apenas o nome dos produtos?
	 * 
	 * map(p ->p.nome)
	 * 
	 * Lapis , Notebook, Caderno, Caneta
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
