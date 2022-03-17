
public class NameGenerator {
	public String[] generateStarWarsName (String[] entrada) {
		String NomeFinal;

		entrada = new String[4];
		entrada[0] = "João Aparecido da Silva";
		entrada[1] = "Dores";
		entrada[2]= "Blumenau";
		
		
		String[] test = entrada[0].split(" ");
		
		
		NomeFinal = test[test.length -1].substring(0, 2) + test[0].substring(0,2) + " " + entrada[1].substring(0,1) + entrada[2].substring(0,2);
		
		return NomeFinal;
	}


}
