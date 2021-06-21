package Fourth;
import java.util.Scanner;

public class Program{
	public static void main(String[]args) {
		int f,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = sc.nextInt();
		
		c = (f-32)*5/9;
		System.out.println("A temperatura em Celsius é: ");
		System.out.println(c);
	}
}