import java.util.Scanner;
public class numeroPotencia {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=0, p=1, e, b;
		System.out.print("Coloque um n�mero: ");
		b= in.nextInt();
		System.out.print("Coloque o expoente: ");
		e= in.nextInt();
		while (i != e) {
			p = p*b;
			i= i+1;
		}
		System.out.println("Pot�ncia: "+p);
		in.close();
	}
}
