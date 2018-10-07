import java.util.Scanner;
public class Ejercicio1
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("¿Cual es el barrio de la comisaria?: ");
		String location = keyboard.nextLine();

		System.out.print("¿Cual es la direccion?: ");
		String address = keyboard.nextLine();

		System.out.print("¿Entre que calle esta?, Escriba el nombre de la primera: ");
		String street1 = keyboard.nextLine();

		System.out.print("Cual es el nombre de la segunda calle?: ");
		String street2 = keyboard.nextLine();

		System.out.println("La comisria mas cercana esta en la calle: " + address + " Entre la calle: " + street1 + " y la calle: " + street2 + " Ubicado en el barrio de: " + location);

	
	}

}
