import java.util.Scanner;

public class ejercicio3{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

			System.out.print("Ingrese un numero romano para ver su valor en numero entero: ");
			String romano = teclado.nextLine();

				switch (romano){
					case"I":
							System.out.println("1");
							break;

					case"V":
							System.out.println("5");
							break;

					case"X":
							System.out.println("10");
							break;

					case"L":
							System.out.println("50");
							break;

					case"C":
							System.out.println("100");
							break;

					case"M":
							System.out.println("1000");
							break;

				default:
						System.out.println("Error no ingreso un numero romano correcto");
						break;

				}
		}
}

