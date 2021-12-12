package streamApi.streams;

public class StreamTeroria {
/*
 * 
 * Dentro da api de streams eu tenho uma série de operadores, são mais de 30 métodos disponível 
 * 
 * grupos de operações:
 * 
 * 1- build :
 * A forma que eu tenho para criar  um Stream. Você pode criar streams através de um métodos static, de uma lista
 * 
 * 2-Intermedian
 *  Ajudam a transformar os dados passando por varias funções, utilizando aquela ideia de compor uma função atrás da outra
 * >Sempre retornam nova Stream
 * 
 * Se eu tenho por exemplo um método de build
 * |---------
 * | Build   | -> gero uma stream ->|int|S-> a partir daqui eu tenho minhas operações intermediárias-gero outra Stream do tipo string |int|String,
 * de tal forma que eu também posso chamar outra operação intermdiária para fazer alguma outra coisa e no final eu tenho uma operação terminal
 * 3-Terminal Operator
 * 
 * Pode gerar algo diferente de uma stream, por exemplo : No final eu quero pegar todos os preços com impostos , quero somar e dividir pela quantidade e obter uma média
 * posso gerar um valor final Double, como Double não é uma stram eu não posso continuar encadiando uma stream.
 * 
 * -------
 * 
 * Eu posso ter Streams Ordenadas (que tem uma sequencia a ser seguidas) e NÃO ordenadas.
 * 
 * Stream sequencial o dados é processado sempre um dados por vez
 * 
 * Paralel.Stream> Se você tem uma lista de 10 elementos  é possível que internamente ele crie varias linahs de execução  para ir processando esses dados
 * de forma paralela
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
 * 
 * 
 * 
 * 
 * 
 * */
}
