package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E02 {
	static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		int n=1;
		 do{
			out.print("Insira um número positivo inteiro: ");
			n = sc.nextInt();
		}while(n<=0);
		for(int i = n; i >= 0; i--) {
			out.println(i);
		}
	}

}
