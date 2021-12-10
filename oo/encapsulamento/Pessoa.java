package oo.encapsulamento;

public class Pessoa {

	
	private String nome;
	
    private String Sobrenome;
	
	private  int idade;
	
	public Pessoa(String nome,String Sobrenome,int idade) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(Sobrenome);
	}
	
	 public int getIdade() {
	
		 return idade;
	}
	 
	 public void setIdade(int novaIdade) {
		 novaIdade=Math.abs(novaIdade);
		 if(novaIdade>=0&&novaIdade<=120) {
		 this.idade=novaIdade;
		 }
	 }
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		@Override
		public String toString() {
			return "Olá eu sou o  "+getNome()+ " e tenho "+getIdade()+" anos.";
		}

		public String getSobrenome() {
			return Sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			Sobrenome = sobrenome;
		}
		public String getNomeCompleto() {
			return getNome()+" "+getSobrenome();		
			}
	
	
	
}
