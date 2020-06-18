package Forum1606;

import java.util.Calendar;

public class App {
	
	public static void main(String[] args) {		
		
		Aluno gustavo = new Aluno("Gustavo ", "Cesar", Endereco endereco, "19551552");
		
		
		Endereco endereco = new Endereco("Av. guedner", 1610, "Univercidade", "Sol Nascente", "Maringa", "Paraná");
		
		
		Avalista fulanoAvalista = new Avalista("Fulando", "Fulando", endereco);
		contrato.adicionarAvalista(fulanoAvalista);
		
		Contrato contrato = new Contrato(gustavo, Situacao.class);
		gustavo.setContrato(contrato);
		
		
		Curso curso = new Curso("ADS", 01);
		
		
		Turma turma = new Turma("ADSIS", 01);
		curso.adicionarTurmas(turma);
		
		turma.adicionarAluno(gustavo);
		
		System.out.println(curso);
		System.out.println(turma);
		
		
	}

}

}
