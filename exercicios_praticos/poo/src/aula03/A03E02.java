package aula03;
import java.util.Scanner;
public class A03E02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "";
		for (int i = 0; i < args.length; i++) {
			if (i != args.length - 1)frase += args[i] + " ";
			else frase += args[i];
		}
		String [] frasesS = verPalavras(frase);
		System.out.println(frasesS.length);
		imprimirFrases(frasesS);
		
		sc.close();
	}
	public static String[] verPalavras (String frases) {
		String[] splitFrases = frases.split("[!?.]+");
		return splitFrases;
	}
	public static void imprimirFrases (String [] frases) {
		for (int i = 0; i < frases.length; i++) System.out.println(frases[i]);
	}
}