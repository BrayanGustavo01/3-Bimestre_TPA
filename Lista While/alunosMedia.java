import java.util.Scanner;
public class alunosMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1;
		double n1, n2, m;
		
		while (i <= 5) {
			System.out.println("Entre com a 1ª Nota do aluno "+i+":");
			n1 = ler.nextDouble();
			System.out.println("Entre com a 2ª Nota do aluno "+i+":");
			n2 = ler.nextDouble();
			m = (n1+n2)/2;
			System.out.println("Sua média é: "+m);
			if (m >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			} 
			i++;
		} ler.close();
	}
}
