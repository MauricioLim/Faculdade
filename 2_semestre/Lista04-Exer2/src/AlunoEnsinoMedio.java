import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno{
	
	private int ano;

	public AlunoEnsinoMedio(String nome, LocalDate data, int ano) throws Exception {
		super(nome, data);
		this.setAno(ano);
	}

	//METODO GET
	public int getAno() {
		return ano;
	}

	//METODO SET
	public void setAno(int ano) throws Exception {
		if(ano == 1 || ano == 2 || ano == 3) {
			this.ano = ano;
		} else {
			throw new Exception("Formado invalido");
		}
	}

	
	public int getIdade() {
		return (2022 - this.getDataNascimento().getYear());
	}
	
	
	@Override
	String mostrar() {
		
		return (this.getNome() + " esta cursando o " + this.getAno() + " e tem " + this.getIdade() + " anos.");
	}

}
