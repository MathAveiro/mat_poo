package aula02;
import java.util.*;

public class A02E01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double notaT=0, notaP=0;
		while(notaT<0 || notaT>20) {
			System.out.print("Nota teórica: ");
			notaT = sc.nextDouble();
		}
		while(notaP<0 || notaP>20) {
			System.out.print("Nota prática: ");
			notaP = sc.nextDouble();
		}
		
		double notaF;
		if(notaT<7.0) {
			notaF = 66.0;
		} else if(notaP<7.0) {
			notaF = 66.0;
		} else {
			notaF = 0.4*notaT + 0.6*notaP;
		}
		System.out.println("Nota final: "+Math.round(notaF));
	}

}
