import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Evento {

	private String titulo;
	private float valor;
	private LocalDate data;
	protected Avaliacao avaliacoes;
	
	//METODO CONSTRUTOR
	public Evento(String titulo, float valor, LocalDate data) {
		this.setTitulo(titulo);
		this.setValor(valor);
		this.setData(data);
	}
	
	//METODO DESTRUTOR
	protected void finalize() throws Throwable {
    }
	
	//METODOS GET
	public String getTitulo() {
		return titulo;
	}
	public float getValor() {
		return valor;
	}
	public LocalDate getData() {
		return data;
	}
	
	//METODOS SET
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void setData(LocalDate data) {
		
	}
	
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacoes = avaliacao;
	}
	
	public String getAvalicao() {
		String msg = " teve " + this.avaliacoes.getQtdPagantes() + " que acharam o evento " + this.avaliacoes.getOpiniaoGeral();
		return msg;
	}
	
	public String exibir() {
		String msg = "";
		String msgAvaliacao = "";
		
		if(this.getAvalicao() != null) {
			msgAvaliacao = "Ainda não avaliado";
		} else {
			msgAvaliacao = this.getAvalicao();
		}
		msg = "Evento: " + this.getTitulo() + ", no dia " + this.getData() + " ingressos a R$ " + this.getValor() + msgAvaliacao;
		
		return msg; 
	}

}
