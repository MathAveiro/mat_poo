package aula01;
import java.util.Scanner;
public class A01E02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km, miles;
		System.out.print("Insira dist�ncia em km: ");
		km = sc.nextDouble();
		miles = km / 1.609;
		System.out.println("A dist�ncia em milhas � " + miles);
		sc.close();
	}
}