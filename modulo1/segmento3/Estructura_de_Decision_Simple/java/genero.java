import java.util.Scanner;
public class genero {
		public static void main(String args[]) {
				Scanner teclado = new Scanner(System.in);
				System.out.print("Ingrese su genero: ");
				String genero = teclado.nextLine();

				if(genero.equals("Masculino") || genero.equals("Femenino"))
						System.out.println("Su genero es: " + genero);
		}
}
