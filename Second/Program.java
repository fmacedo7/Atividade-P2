package Second;
import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		int a,b,c,delta,res;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coefici�nte A:");
		a = sc.nextInt();                       //Ler a vari�vel a
		System.out.println("Coefici�nte B:");
		b = sc.nextInt();
		System.out.println("Coefici�nte C:");
		c = sc.nextInt();
		
		delta = b * b - 4 * a * c;//Opera��o para achar o delta da equa��o
		
		System.out.println("O delta da equa��o �: ");
		System.out.println(delta);//Exibe o valor calculado na linha 16
	}
}