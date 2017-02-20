package aula01;
import java.util.Scanner;
public class A01E05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza o tempo em segundos: ");
		int total = sc.nextInt();
		int horas = total / 3600;
		int minutos = (total - (3600 * horas)) / 60;
		int segundos = total % 60;
		System.out.printf("%2d:%2d:%2d", horas, minutos, segundos);
		sc.close();
	}
}