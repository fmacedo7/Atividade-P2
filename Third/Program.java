package Third;
import java.util.Scanner;

public class Program{
	public static void main(String[]args) {
		int t,d,vm=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo: ");
		t = sc.nextInt();
		System.out.println("Digite a Dist�ncia: ");
		d = sc.nextInt();
		
		vm = d/t;
		
		System.out.println("A velocidade m�dia �: ");
		System.out.println(vm);
	}
}