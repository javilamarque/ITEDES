import java.util.Scanner;
public class ejercicio5 
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese Su edad: ");
		Integer edad = Integer.parseInt(teclado.nextLine());

		System.out.print("Ingrese su genero: ");
		String genero = teclado.nextLine();

		if(edad >= 18){
			System.out.println("Su genero es: " + genero	+ " Usted es mayor de edad ");

		}
		else{
			System.out.println("Su genero es: " + genero + " Usted es menor de edad ");
		}
		
		
	}

}

