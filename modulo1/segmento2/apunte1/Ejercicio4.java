import java.util.Scanner;
public class Ejercicio4
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero para la suma: ");
		int num1 = keyboard.nextInt();

		System.out.print("Ingrese otro numero para la suma: ");
		int num2 = keyboard.nextInt();

		int result =(num1 + num2);

		System.out.print("El resultado de la suma es: " + result);
	}


}
