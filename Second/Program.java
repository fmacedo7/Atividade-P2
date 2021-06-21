package Second;
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		int a,b,c,delta,res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coeficiênte A:");
		a = sc.nextInt();                       //Ler a variável a
		System.out.println("Coeficiênte B:");
		b = sc.nextInt();
		System.out.println("Coeficiênte C:");
		c = sc.nextInt();
		
		delta = b * b - 4 * a * c;//Operação para achar o delta da equação
		
		System.out.println("O delta da equação é: ");
		System.out.println(delta);//Exibe o valor calculado na linha 16
	}
}