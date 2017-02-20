package aula01;
import java.util.Scanner;
public class A01E07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.print("Introduza o valor do cateto A: ");
		double cA = sc.nextDouble();
		System.out.print("Introduza o valor do cateto B: ");
		double cB = sc.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(cA,2)+Math.pow(cB,2));
		double ang = Math.acos(cA / hipotenusa) * (180/Math.PI);
		System.out.printf("O valor da hipotenusa é: %.2f e o ângulo entre o lado A e a hipotenusa é de: %.2fª", hipotenusa, ang);
	}
}
