package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean play = true, win = false;
		do {
			do {
				int number = 100*(int)(Math.random())+1;
				int n;
				do {
					out.print("Inserir n�:" );
					n=sc.nextInt();
				}while(n<0 || n>100);
				if(n>number) {
					out.println("Demasiado alto!");
				} else if(n<number) {
					out.println("Demasiado baixo!");
				} else {
					out.println("Ganhou!");
					win = true;
				}
			}while(!win);
			boolean invalidAnswer = false;
			do {
				out.print("Pretende jogar novamente?(sim/n�o) ");
				String answer = sc.nextLine();
				if(answer.equals("n�o")) {
					play = false;
				} else if (answer.equals("sim")) {
					play = true;
				} else {
					out.println("Resposta inv�lida!");
					invalidAnswer = true;
				}
			}while(invalidAnswer);
		}while(play);
	}

}
