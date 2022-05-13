
public class Curso {
	
	private String sigla;
	private String nome;
	
	public Curso(String sigla, String nome) throws Exception {
		this.setNome(nome);
		this.setSigla(sigla);
	}
	
	@Override
	protected void finalize() throws Throwable{
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		
		if(sigla.length() == 3) {
			this.sigla = sigla;
		} else {
			throw new IllegalArgumentException("Quantidade de letras invalida");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		if(nome.length() >= 5) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Formato de nome invalido");
		}
	}

}
