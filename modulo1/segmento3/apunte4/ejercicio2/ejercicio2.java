import java.util.Scanner;

public class ejercicio2{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			System.out.print("Ingrese un caracter para ver si es, vocal, consonante o numero: ");
			String caracter = keyboard.nextLine();

			switch(caracter){
				case"1":
				case"2":
				case"3":
				case"4":
				case"5":
				case"6":
				case"7":
				case"8":
				case"9":
				case"0":
					System.out.println("Es Numero");
					break;

				case"a":
				case"e":
				case"i":
				case"o":
				case"u":
					System.out.println("Es Vocal");
					break;
				
				case"b":
				case"c":
				case"d":
				case"f":
				case"g":
				case"h":
				case"j":
				case"k":
				case"l":
				case"m":
				case"n":
				case"p":
				case"q":
				case"r":
				case"s":
				case"t":
				case"v":
				case"w":
				case"x":
				case"y":
				case"z":
					System.out.println("Es Consonante:");
					break;
				
				default:
					System.out.println("Error ustes ingreso un symbolo");
					break;
			}
	}
}

				
