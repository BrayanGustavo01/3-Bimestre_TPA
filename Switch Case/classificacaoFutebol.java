import java.util.Scanner;
public class classificacaoFutebol {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int idade;
		System.out.print("Informe a Idade do aluno: ");
		idade = in.nextInt();
		System.out.println("Categoria:");
		switch (idade) {
		case 6:
			System.out.println("Dente de leite");
			break;
		case 7:
			System.out.println("Júnior");
			break;
		case 8:
			System.out.println("Júnior Max");
			break;
		case 9:
			System.out.println("Júnior Master");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("A escola não admite alunos dessa idade");
		}
		in.close();
	}
}
