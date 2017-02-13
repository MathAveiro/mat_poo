package aula01;
import java.util.Scanner;
public class A01E06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		System.out.print("Introduza as coordenadas do ponto 1: ");
		p1.x = sc.nextDouble();
		p1.y = sc.nextDouble();
		System.out.print("Introduza as coordenadas do ponto 2: ");
		p2.x = sc.nextDouble();
		p2.y = sc.nextDouble();
		double dist = Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
		System.out.println("A distância entre os pontos é " + dist);
		sc.close();
	}
}
class Ponto {
	double x, y;
}