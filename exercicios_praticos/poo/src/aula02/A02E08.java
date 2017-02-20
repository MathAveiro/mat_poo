package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E08 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.print("Inserir nº: ");
		byte n = sc.nextByte();
		int mask = 1 << 7, count = 0;
		for(int i = 1; i < 9; i++) {
			if((n & mask) != 0) {
				count++;
			}
			n <<= 1;
		}
		out.println("Existem "+count+" bits com o valor \"1\"");
	}

}
