import java.util.Scanner;
public class ejercicio3{
		public static void main(String args[]) {
				Scanner teclado = new Scanner(System.in);

				System.out.print("Ingrese su genero: ");
				String genero = teclado.nextLine();

				if(genero.equals("Masculino") || genero.equals("Femenino")){

						System.out.println("Su genero es: " + genero);
				}
	           else {
			   			System.out.println("Usted no ingreso un genero valido");
			   }
		}
}
