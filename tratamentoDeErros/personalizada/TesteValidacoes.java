package tratamentoDeErros.personalizada;

import streamApi.streams.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
	
		try {
			Aluno aluno =new Aluno ("",-7.0);
			
			Validar.aluno(aluno);
		} catch (StringVaziaExepetion |NumeroForaIntervalo e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");
		
	}

}
