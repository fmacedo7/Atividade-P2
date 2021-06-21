package First;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n1,n2,n3,soma=0,med;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro número");
		n3 = sc.nextInt();
		soma = n1+n2+n3;
		med = soma/3;
		System.out.println("O resultado é");
		System.out.println(med);
	}
}