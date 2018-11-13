import java.util.Scanner;

public class ejercicio2{
	
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
			
			String salir = "n";			
			
			do{

			System.out.print("Ingrese un numero para la suma: ");
			Integer num1 = keyboard.nextInt();

			System.out.print("Ingrese otro numero para la suma: ");
			Integer num2 = keyboard.nextInt();

			Integer result = num1 + num2;

			System.out.println("El resultado es: " + result);
			
			
			System.out.println("¿Desea realizar otra suma? (s/n) ");
			salir = keyboard.next();
			} while(salir.equals("s"));

	}
}


		
