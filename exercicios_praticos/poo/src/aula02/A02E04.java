package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E04 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double[] n = new double[0];
		int count = 0;
		double first=0;
		boolean end = false;
		do {
			n = extendArray(n);
			out.print("Inserir número: ");
			n[count] = sc.nextDouble();
			first = n[0];
			if(n[count]==first) {
				if(count != 0) end = true;
			}
			if(!end) count++;
		}while(!end);
		double max=n[0], min=n[0], med=0;
		for(int i = 0; i < n.length; i++) {
			if(n[i]>max) max=n[i];
			if(n[i]<min) min=n[i];
			med += n[i];
		}
		out.println("Valor máximo: "+max+" Valor mínimo: "+min+" Média: "+med/n.length+" Nº de valores lido: "+n.length);
	}
	private static double[] extendArray(double[] n) {
		double[] newArray = new double[n.length+1];
		for(int i = 0; i < n.length; i++) {
			newArray[i] = n[i];
		}
		return newArray;
	}

}
