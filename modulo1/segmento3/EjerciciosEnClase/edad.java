import java.util.Scanner;
public class edad
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese su nombre: ");
		String name = keyboard.nextLine();

		if (name.equals("pedro"))
		{
			System.out.println("Hola pedro");
		}
	}

}
