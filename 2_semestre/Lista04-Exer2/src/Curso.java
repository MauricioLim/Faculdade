
public class Curso {
	
	private String sigla;
	private String nome;
	
	public Curso(String sigla, String nome) throws Exception {
		this.setNome(nome);
		this.setSigla(sigla);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) throws Exception {
		
		if(sigla.length() == 3) {
			this.sigla = sigla;
		} else {
			throw new Exception("Quantidade de letras invalida");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		
		if(nome.length() >= 5) {
			this.nome = nome;
		} else {
			throw new Exception("Formato de nome invalido");
		}
	}

}
