package First;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n1,n2,n3,soma=0,med;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro n�mero");
		n3 = sc.nextInt();
		soma = n1+n2+n3;
		med = soma/3;
		System.out.println("O resultado �");
		System.out.println(med);
	}
}