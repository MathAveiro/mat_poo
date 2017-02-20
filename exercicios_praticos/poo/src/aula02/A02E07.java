package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E07 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[][] notas = new double[16][2];
		for(int i = 0; i < 16; i++) {
			notas[i][0] = 20*Math.random();
			notas[i][1] = 20*Math.random();
		}
		out.println("NotaT	NotaP	Pauta");
		for(int i = 0; i < 16; i++) {
			out.printf("%2.1f	%2.1f	",notas[i][0], notas[i][1]);
			if(notas[i][0]<7 || notas[i][1]<7) {
				double notaF = 66.0;
				out.println(notaF);
			} else {
				double notaF = notas[i][0]*0.4+notas[i][1]*0.6;
				out.printf("%2.1f\n", notaF);
			}
		}
	}

}
