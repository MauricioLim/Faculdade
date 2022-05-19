
public class Avaliacao {

	private int qtdPagantes;
	private String opiniaoGeral;
	
	
	//METODOS GET
	public int getQtdPagantes() {
		return qtdPagantes;
	}
	public String getOpiniaoGeral() {
		return opiniaoGeral;
	}

	//METODOS SET
	public void setQtdPagantes(int qtdPagantes) {
		if(qtdPagantes < 0) {
			throw new IllegalArgumentException("Quantidade invalida");
		}
			
	}
	public void setOpiniaoGeral(String opiniaoGeral) {
		this.opiniaoGeral = opiniaoGeral;
	}
	
	

}
