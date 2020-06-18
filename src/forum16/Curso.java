package forum16;

import java.util.HashSet;

public class Curso {

	private String descricao;
	private Integer codigo;
	private HashSet<Turma> turmas;

	public Curso(String descricao, Integer codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
		this.turmas = new HashSet<Turma>();
	}

	public void addTurmas(Turma turma) {
		this.turmas.add(turma);
	}
}
