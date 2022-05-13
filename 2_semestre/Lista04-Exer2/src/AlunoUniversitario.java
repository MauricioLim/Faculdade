import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{
	
	private char formaIngresso;
	private Curso curso;
	
	public AlunoUniversitario(String nome, LocalDate data, char ingresso)  {
		super(nome, data);
	}

	
	
	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso){
		Character.toUpperCase(formaIngresso);
		if(formaIngresso == 'V' || formaIngresso == 'E' || formaIngresso == 'S' ||  formaIngresso == 'T' || formaIngresso == 'I') {
			this.formaIngresso = formaIngresso;
		} else {
			throw new IllegalArgumentsException("Formato de ingressão invalida");
		}
			
		
	}

	public String getStringFormaIngresso() {
		String forma = "";
			
		if(this.getFormaIngresso() == 'E') {
			forma = "ENEM";
		} else if(this.getFormaIngresso() == 'V') {
			forma = "vestibular";
		} else if(this.getFormaIngresso() == 'S') {
			forma = "seletivo especial";
		} else if(this.getFormaIngresso() == 'T') {
			forma = "transferencia externa";
		} else if(this.getFormaIngresso() == 'I') {
			forma = "Transferencia interna";
		}
		
		return forma;
	}
	
	
	
	@Override
	String mostrar() {
		
		return (this.getNome() + " é aluno universitario do curso " + this.curso.getSigla() + " - " + this.curso.getNome() + ", ingressado por " + this.getStringFormaIngresso());
	}

}
