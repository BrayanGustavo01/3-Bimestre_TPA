import java.util.Scanner;
public class ex1_Placa {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int pl;
		System.out.print("Coloque o Último dígito da sua placa: ");
		pl= in.nextInt();
		switch (pl){
		case 1:
		case 2:
			System.out.println("Dia de Restrição: Segunda-Feira");
			break;
		case 3:
		case 4:
			System.out.println("Dia de Restrição: Terça-Feira");
			break;
		case 5:
		case 6:
			System.out.println("Dia de Restrição: Quarta-Feira");
			break;
		case 7:
		case 8:
			System.out.println("Dia de Restrição: Quinta-Feira");
			break;
		case 9:
		case 0:
			System.out.println("Dia de Restrição: Sexta-Feira");
			break;
		default:
			System.out.println("Placa Inválida");
		}
		in.close();
	}
}
