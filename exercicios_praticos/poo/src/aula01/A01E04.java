package aula01;
import java.util.Scanner;
public class A01E04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v1, v2;
		System.out.print("Introduza a velocidade m�dia da 1� metade: ");
		v1 = sc.nextDouble();
		System.out.print("Introduza a velocidade m�dia da 2� metade: ");
		v2 = sc.nextDouble();
		double vf = (v1 + v2)/2;
		System.out.print("A velocidade m�dia total � " + vf);
		sc.close();
	}
}
