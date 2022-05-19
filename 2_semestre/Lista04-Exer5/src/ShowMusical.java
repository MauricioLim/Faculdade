import java.time.LocalDate;

public class ShowMusical extends Evento{
	
	private String nomeBanda;
	private String estiloMusical;

	public ShowMusical(String titulo, float valor, LocalDate data, String nomeBanda, String estiloMusica) {
		super(titulo, valor, data);
		this.setNomeBanda(nomeBanda);
		this.setEstiloMusical(estiloMusica);
		
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		if (nomeBanda == null) {
			throw new RuntimeException("Estilo musical invalido");
		} else {
			this.nomeBanda = nomeBanda;
		}
		
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		if (estiloMusical == null) {
			throw new RuntimeException("Estilo musical invalido");
		} else {
			this.estiloMusical = estiloMusical;
		}
	}

	public String getAvalicao() {
		String msg = " contou com  " + this.avaliacoes.getQtdPagantes() + " no dia " + this.getData() + ". Opinião; " + this.avaliacoes.getOpiniaoGeral();
		return msg;
	}
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacoes = avaliacao;
	}
	
	public String exibir() {
		String msg = "";
		String msgAvaliacao = "";
		
		if(this.getAvalicao() != null) {
			msgAvaliacao = "Ainda não avaliado";
		} else {
			msgAvaliacao = this.getAvalicao();
		}
		msg = "Show Musical: " + this.getTitulo() + " de " + this.getEstiloMusical() + " de " + this.getNomeBanda() + " com ingressos a R$" + String.format("%.2f", this.getValor())
				+ msgAvaliacao;
		
		return msg; 
	}
	
}
