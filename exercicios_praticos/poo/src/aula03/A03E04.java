package aula03;
import java.util.Scanner;
public class A03E04 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] valores = leituraDosValores();
		printCal(valores[2], ndiasMes (valores[1], valores[0]));
		sc.close();
	}
	public static int [] leituraDosValores () {
		int [] valores = new int [3];
		System.out.print("Introduza o ano: ");
		valores[0] = sc.nextInt();
		System.out.print("Introduza o mês: ");
		valores[1] = sc.nextInt();
		System.out.print("Introduza o dia da semana com que começa o mês: ");
		valores[2] = sc.nextInt();
		return valores;
		
	}
	public static int ndiasMes (int m, int a) {
		switch(m){
			case 1: return 31;
			case 2:
				if(anoBissexto(a)) return 29;
				else return 28;
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
		}
		return 0;
	}

	public static boolean anoBissexto (int a) {
		if(a%400==0 || (a%4==0 && a%100!=0)) return true;
		else return false;

	}
	public static void printCal (int d, int ndiasMes) {
		boolean acabar = false;
		int [][] temp = new int [6][7];
		int j = 0, k = d-1;
		for (int i = 1; i <= ndiasMes; i++) {
			temp [j][k] = i;
			k++;
			if (k == 7 || k == 7|| k == 7) {
				k = 0;
				j++;
			}
		}
		System.out.printf("-----------------------\n");
		System.out.printf("| Mo Tu We Th Fr Sa Su|\n");
		                   
		System.out.printf("-----------------------\n");
		System.out.printf("| ");
		for	(int i = 0; i < temp.length; i++) {
			for (int u = 0; u < temp[i].length; u++) {
				if (temp[i][u] == 0) {
					if (i == 0) System.out.printf("   ");
					else {
						if (u == 6 || u == 13 || u == 20) {
							System.out.printf("  ");
							acabar = true;	
						}
						else System.out.printf("   ");
					}
				}
				else {
					if (u == 6 || u == 13 || u == 20) System.out.printf("%2d",temp[i][u]);	
					else System.out.printf("%2d ",temp[i][u]);	
				}
			}
			if (acabar) {
				System.out.printf("|\n-----------------------");
				break;
			} else System.out.printf("|\n| ");
			
		}
	}
}