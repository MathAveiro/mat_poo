package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		do {
			out.print("Inserir valor positivo inteiro: ");
			n = sc.nextInt();
		}while(n<=0);
		boolean isPrime = true;
		if(n>2) {
			for(int i = 2; i < n; i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		out.println(isPrime ? "É primo!" : "Não é primo");
	}

}
