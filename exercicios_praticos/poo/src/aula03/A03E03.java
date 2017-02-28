package aula03;
import java.util.Scanner;
public class A03E03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ponto ponto = new Ponto();
		//System.out.print("Introduza a coordenada x do centro: ");
		//ponto.x = sc.nextDouble();
		ponto.x = 2;
		//System.out.print("Introduza a coordenada y do centro: ");
		//ponto.y = sc.nextDouble();
		ponto.y = 4;
		//System.out.print("Introduza a cor: ");
		//String cor = sc.next();
		String cor = "amarelo";
		//System.out.print("Introduza o raio: ");
		//double raio = sc.nextDouble();
		double raio = 2;
		//System.out.print("Introduza o lado1: ");
		//double lado1 = sc.nextDouble();
		double lado1 = 4;
		//System.out.print("Introduza o lado2: ");
		//double lado2 = sc.nextDouble();
		double lado2 = 5;
		Quadrado q = new Quadrado(cor, ponto, lado1);
		Circulo c = new Circulo(cor, ponto, raio);
		Retangulo r = new Retangulo(cor, ponto, lado1, lado2);
		q.voidArea();
		q.voidPerimetro();
		r.voidArea();
		r.voidPerimetro();
		c.voidArea();
		c.voidPerimetro();
		Ponto pontoTemp = new Ponto ();
		pontoTemp.x = 2;
		pontoTemp.y = 1;
		Circulo temp = new Circulo ("amarelo", pontoTemp, 5);
		c.verificarCir(temp);
		System.out.println(q.toString());
		System.out.println(c.toString());
		System.out.println(r.toString());
		sc.close();
	}
}