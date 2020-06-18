package forum16;

import java.util.HashSet;


public class Turma {

	private String nome;
	private Integer sold;
	private Aluno lider;
	private HashSet<Aluno> alunos;

	public Turma(String nome, Integer sold) {
		this.nome = nome;
		this.sold = sold;
		alunos = new HashSet<Aluno>();
	}

	public void addAluno(Aluno aluno) {
		if(aluno.getContrato().getSituacao().equals("IRREGULAR")) {
			return;
		}
		this.alunos.add(aluno);
		aluno.setTurma(this);
	}
	
	public void addLider(Aluno lider) {
		this.lider = lider;		
	}
	
	public Aluno getLider() {
		return lider;
	}
	
	public String getNome() {
		return nome;
	}
	 public Integer getSold() {
		return sold;
	}
	 
	 public HashSet<Aluno> getAlunos() {
		return alunos;
	}
	 

}

