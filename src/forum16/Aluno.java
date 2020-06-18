package forum16;

public class Aluno {

	private String nome;
	private String sobrenome;
	private Endereco endereco;
	private Contrato contrato;
	private Turma turma;

	public Aluno(String nome, String sobrenome, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}


	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
		
	}
	public Contrato getContrato() {
		return contrato;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}


}
