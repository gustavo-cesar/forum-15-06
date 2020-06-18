package forum16;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Contrato {
	
	private Aluno aluno;
	private HashSet<Avalista> avalistas;
	private String situacao;
	
	public Contrato(Aluno aluno, String  situacao) {
		this.aluno = aluno;
		this.situacao = situacao;
		this.avalistas = new HashSet<Avalista>();
	}
	public void adicionarAvalista(Avalista avalista) {
		this.avalistas.add(avalista);
	}
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Collection<Avalista> getAvalistas() {
		return Collections.unmodifiableCollection(avalistas);
	}

}
