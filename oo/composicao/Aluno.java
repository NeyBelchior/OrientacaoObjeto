package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	
final	ArrayList<Curso> cursos = new ArrayList<>();
	
	
	
	Aluno(String nome){
		this.nome=nome;
	}
	
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
		
		
	}
	
	Curso obterCursoPorNome(String nome) {
		//o this aqui é reduntante?
		for(Curso curso : cursos) {
			if(curso.nome.equalsIgnoreCase(nome)){
				return curso;
			}
				
		}
		return null;
		}
		
	
	
	public String toString() {
		return nome;
	}
	
	

}
