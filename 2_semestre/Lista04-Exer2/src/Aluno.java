import java.time.LocalDate;

public abstract class Aluno {

	private String nome;
	private LocalDate dataNascimento;
	
	public Aluno(String nome, LocalDate data) throws Exception {
		this.setNome(nome);
		this.setDataNascimento(data);
	}
	
	protected void finalize() throws Throwable(){
	}

	//METODOS GET
	public String getNome() {
		return nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	//METODOS SET
	public void setNome(String nome) throws Exception {
		
		if(nome.length() > 5) {
			this.nome = nome;
		} else {
			throw new Exception("Formado de nome invalido");
		}
			
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	abstract String mostrar();
}
