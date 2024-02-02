import java.util.Locale;
import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horai = sc.nextInt();
		int horaf = sc.nextInt();
		
		int duracao;
		
		if (horai < horaf) {
			
			duracao = horai - horaf;
		} else {
			duracao = 24 - horai + horaf;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();
	}

}
