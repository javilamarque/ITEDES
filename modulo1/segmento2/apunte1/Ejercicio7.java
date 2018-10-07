import java.util.Scanner;
public class Ejercicio7
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero para la division: ");
		int num1 = keyboard.nextInt();

		System.out.print("Ingrese otro numero para la division: ");
		int num2 = keyboard.nextInt();

		int result = (num1 / num2);

		System.out.println("El resultado de la division es: " + result);
	}

}
