package Third;
import java.util.Scanner;

public class Program{
	public static void main(String[]args) {
		int t,d,vm=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo: ");
		t = sc.nextInt();
		System.out.println("Digite a Distância: ");
		d = sc.nextInt();
		
		vm = d/t;
		
		System.out.println("A velocidade média é: ");
		System.out.println(vm);
	}
}