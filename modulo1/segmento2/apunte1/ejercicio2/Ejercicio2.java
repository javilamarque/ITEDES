import java.util.Scanner;
public class Ejercicio2
{
	public static void main(String args[])
	{
			Scanner keyboard = new Scanner(System.in);

			System.out.print("Ingrese su nombre: ");
			String name = keyboard.next();

			System.out.print("Ingrese su apellido: ");
			String LastName = keyboard.next();

			System.out.print("Ingrese su DNI: ");
			int dni = keyboard.nextInt();

			System.out.print("Ingrese su direccion: ");
			String address = keyboard.next();

			System.out.print("Ingrese su numero telefonico: ");
			int tel = keyboard.nextInt();

			System.out.println("Su nombre y apellido es: " + name + " " + LastName + " Su documento es: " + dni + " Su direccion es: " + address + " Y su numero telefonico es: " + tel);


	
	}

}
