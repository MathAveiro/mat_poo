package aula02;
import java.util.*;
import static java.lang.System.*;

public class A02E05 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int mm, aa;
		boolean valid = true;
		do {
			out.print("Inserir data(mm/aa): ");
			String date = sc.nextLine();
			String[] parts = date.split("/");
			mm=Integer.parseInt(parts[0]);
			aa=Integer.parseInt(parts[1]);
			if(mm<0 || mm>12) {
				valid = false;
			} else if(aa<0) {
				valid = false;
			}
		}while(!valid);
		int numDays=0;
		switch(mm) {
			case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	            numDays = 31;
	            break;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            numDays = 30;
	            break;
	        case 2:
	            if (((aa % 4 == 0) && 
	                 !(aa % 100 == 0))
	                 || (aa % 400 == 0))
	                numDays = 29;
	            else
	                numDays = 28;
	            break;
		}
		out.println("O número de dias do mês é: "+numDays);
		
	}

}
