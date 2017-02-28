package aula03;
import java.util.Scanner;
public class A03E01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza a primeira String: ");
		String primeira = sc.nextLine();
		System.out.print("Introduza a segunda String: ");
		String segunda = sc.nextLine();
		String total = primeira+segunda;
		imprimirTotal(total);
		imprimirUltimo(primeira);
		verIgual(primeira, segunda);
		verPonto(segunda);
		verMinusculas(segunda);
		primeira = convertMinusculas(primeira);
		segunda = convertMinusculas(segunda);
		total = verEspaços(primeira + " " + segunda);
		sc.close();
	}
	public static void imprimirTotal (String total) {
		System.out.println(total.length());
	}
	public static void imprimirUltimo (String palavra) {
		System.out.println(palavra.charAt(palavra.length()-1));
	}
	public static void verIgual (String primeira, String segunda) {
		System.out.println(primeira.equals(segunda) ? "Iguais" : "Não Iguais");	
	}
	public static void verPonto (String palavra) {
		System.out.println(palavra.charAt(palavra.length()-1) == '.' ? "Termina com '.'" : "Não termina com '.'");	
	}
	public static void verMinusculas (String palavra) {
		for	(int i = 0; i < palavra.length(); i++) if (Character.isUpperCase(palavra.charAt(i))) {
			System.out.println("A palavra não contém só minúsculas");
			return;
		}
		System.out.println("A palavra contém apenas minúsculas");
	}
	public static String convertMinusculas (String palavra) {
		String novaPalavra = "";
		for	(int i = 0; i < palavra.length(); i++) if (Character.isUpperCase(palavra.charAt(i))) {
			novaPalavra += Character.toLowerCase(palavra.charAt(i));
		} else novaPalavra += palavra.charAt(i);
		System.out.println(novaPalavra);
		return novaPalavra;
	}
	public static String verEspaços (String palavra) {
		String[] splitPalavras = palavra.split("\\s+");
		String novaPalavra = "";
		for	(int i = 0; i < splitPalavras.length; i++) {
			if (i != splitPalavras.length - 1) novaPalavra += splitPalavras[i] + " ";
			else novaPalavra += splitPalavras[i];
		}
		System.out.println(novaPalavra);
		return novaPalavra;
	}
}