package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E09 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		out.print("Inserir nº: ");
		byte n = sc.nextByte();
		int mask = 1 << 7;
		for(int i = 1; i < 9; i++) {
			out.print((n & mask) == 0 ? '0':'1');
			n <<= 1;
		}
		sc.close();
	}

}
