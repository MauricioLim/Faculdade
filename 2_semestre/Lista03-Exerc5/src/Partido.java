import java.util.ArrayList;

public class Partido {
	private int Numero;
	private String Nome;
	private ArrayList <Vereador> vereadores;
	
	//METODOS GET
	public int getNumero() {
		return Numero;
	}
	public String getNome() {
		return Nome;
	}
	
	//METODOS SET
	public void setNumero(int numero) {
		Numero = numero;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	//METODO PARA ADICIONAR VEREADOR
	public void addVereador (Vereador vere) {
		if (vere != null) {
		vereadores.add(vere);
		}
	}
}
