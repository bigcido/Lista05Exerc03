package controller;
import model.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	@SuppressWarnings("unused")
	private String invertePalavra(String palavra) {
		PilhaString sp = new PilhaString();
		String[] vetor = palavra.split("");
		
		for (String str : vetor) {
			sp.push(palavra);
			}
		return palavra;
	}
	
	public boolean ehPalindromo(String palavra) {
		PilhaString sp = new PilhaString();
		boolean sinal = true;
		String[] vetor = palavra.split("");
		String auxiliar;
		
		for (String str: vetor) {
			try {
				auxiliar = sp.pop();
				if(!str.equals(auxiliar)) {
					sinal = false;
				}
			} catch (Exception errsp) {
				System.err.println(errsp);
			}
		}
		return sinal;
		} 
}
