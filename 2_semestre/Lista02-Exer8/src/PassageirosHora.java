
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
		int qtdMenor = Integer.MAX_VALUE;
		int menorMes = 0;
		int qtd = 0;
		
		
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz[i].length; j++) {
				for(int k = 0; k < this.matriz[i][j].length; k++) {
					qtd += this.matriz[i][j][k];
				}
				if (qtd<qtdMenor) {
					qtdMenor = qtd;
					menorMes = i + 1;
				}
				qtd = 0;
			}
		}
		return menorMes;
	}
	
	//Item d
	public int[] picoTransporte() {
		int pico[] = ;
		
		int qtdMenor = 0;
		int menorMes = 0;
		int qtd = 0;
		
		
		for(int i = 0; i < this.matriz.length; i++) {
			for(int j = 0; j < this.matriz[i].length; j++) {
				for(int k = 0; k < this.matriz[i][j].length; k++) {
					qtd += this.matriz[i][j][k];
				}
				if (qtd > qtdMenor) {
					qtdMenor = qtd;
					pico = (i + 1);
				}
				qtd = 0;
			}
		}
		
		return pico;
	}
}
