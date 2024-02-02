import java.util.Locale;
import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		
		double hotdog, xsal, xbac, torr, refri;
		
		hotdog = 4.00;
		xsal = 4.50;
		xbac = 5.00;
		torr = 2.00;
		refri = 1.50;
		
		if (codigo == 1) {
			total = quantidade * hotdog;
			System.out.printf("TOTAL: RS %.2f\n", total);
		} else if (codigo == 2) {
			total = quantidade * xsal;
			System.out.printf("TOTAL: RS %.2f\n", total);
		}else if (codigo == 3) {
			total = quantidade * xbac;
			System.out.printf("TOTAL: RS %.2f\n", total);
		}else if (codigo == 4) {
			total = quantidade * torr;
			System.out.printf("TOTAL: RS %.2f\n", total);
		}else if (codigo == 5) {
			total = quantidade * refri;
			System.out.printf("TOTAL: RS %.2f\n", total);
		}
		
		sc.close();
	}

}
