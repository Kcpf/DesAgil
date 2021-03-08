package br.edu.insper.desagil.aula5;

public class Matricula {
	private Aluno aluno;
	private boolean trancada;
	
	public Matricula(Aluno aluno, boolean trancada) {
		super();
		this.aluno = aluno;
		this.trancada = trancada;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}
	
	
}
