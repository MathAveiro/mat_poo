package aula01;
import java.util.Scanner;
public class A01E03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.print("Introduza a temperatura : ");
		celsius = sc.nextDouble();
		fahrenheit = (1.8* celsius) + 32;
		System.out.println("A temperatura em fahrenheit � " + fahrenheit);
		sc.close();
	}
}