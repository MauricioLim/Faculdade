
public class PassageirosHora {
	private int matriz [][][] = new int [12][30][24];
	
	//Item a
	public void adicina(int mes, int dia, int hora) {
		if(mes > 0 && mes <= 12 && dia > 0 && dia <= 30 && hora > 0 && hora <= 24) {
			this.matriz[mes][dia][hora]++; 
		}
	}
	
	//Item b
	public int qtde(int mes, int dia) {
		int qtd = 0;
		
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz[i].length; j++) {
				for(int k = 0; k < this.matriz[i][j].length; k++) {
					qtd += this.matriz[i][j][k];
				}
			}
		}
		return qtd;
	}
	
	//Item c
	public int mesMenorFluxo() {
		int menorMes = Integer.MAX_VALUE;
		int qtd = 0;
		
		
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz[i].length; j++) {
				for(int k = 0; k < this.matriz[i][j].length; k++) {
					qtd += this.matriz[i][j][k];
				}
				if (menorMes < qtd) {
					menorMes = i + 1;
				}
			}
		}
		return menorMes;
	}
}
