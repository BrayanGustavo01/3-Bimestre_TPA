import java.util.Scanner;
public class serieFibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, j=0, n;
		
		System.out.print("Quantas repetições: ");
		n= in.nextInt();
		while (n!=0) {
			i = i+j;
			j= i-j;
			n--;
		}
		System.out.println("As repetições param em: "+j);
		in.close();
	}
}
