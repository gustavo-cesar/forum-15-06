package Forum1606;

import java.util.Collections;
import java.util.HashSet;

public class Turma {

	private String descricao;
	private Integer codigo;
	private HashSet<Aluno> alunos;

	public Turma(String descricao, Integer codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
		alunos = new HashSet<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		if (aluno.getContrato().getSituacao().equals(Situacao.IRREGULAR)) {
			return;
		}
		this.alunos.add(aluno);
		aluno.setTurma(this);
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Set<Aluno> getAlunos() {
		return (Set<Aluno>) Collections.unmodifiableSet(alunos);
	}

	@Override
	public String toString() {
		return "Turma [descricao=" + descricao + ", codigo=" + codigo + ", alunos=" + alunos + "]";
	}

}
