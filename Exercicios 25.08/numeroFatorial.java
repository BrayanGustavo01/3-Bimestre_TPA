import java.util.Scanner;
public class numeroFatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0, n;
		System.out.print("Coloque um n�mero: ");
		n = in.nextInt();
		i = n;
		while (n>1) {
			i= i*(n-1);
			n= n-1;
		}
		System.out.println("O fatorial deste n�mero �: "+i);
		in.close();
	}
}
