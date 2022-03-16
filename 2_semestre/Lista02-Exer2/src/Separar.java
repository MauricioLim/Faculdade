
public class Separar {
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String[] separar() {
		return this.texto.split(" "); //CRIA UM VETOR STRING E SEPARA AS PALAVRAS DE UMA FRASE, O SEPARADOR É O QUE ESTA ENTRE OS PARENTES
		
	}

}
