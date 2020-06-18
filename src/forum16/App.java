package forum16;

public class App {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("av.guedner", 1610, "univercidade", "solnascente", "maringa", "pr");
		
		Aluno gustavo = new Aluno("gustavo ", "cesar", endereco);
	
		
		Avalista fulanoAvalista = new Avalista("Fulano", "Fulano", endereco);
		Contrato contrato = new Contrato(gustavo, "REGULAR");
		contrato.adicionarAvalista(fulanoAvalista);
		
		gustavo.setContrato(contrato);
		
		Turma turma = new Turma("ADSIS", 4975);
		Curso curso = new Curso("ADS", 215);
		curso.addTurmas(turma);
		
		turma.addAluno(gustavo);
		turma.addLider(gustavo);
		
		System.out.println(curso);
		System.out.println(turma);
		
		
	}

}
