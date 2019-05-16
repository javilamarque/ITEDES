import java.util.Scanner;

public class ejercicio3{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		Integer base=0;
		Integer altura=0;
		Integer area=0;

		while(base<=0 || altura<=0){
			
			System.out.print("Ingrese la base mayor a 0: ");
			base = Integer.parseInt(keyboard.nextLine());

			System.out.print("Ingrese la altura mayor a 0: ");
			altura = Integer.parseInt(keyboard.nextLine());
		}

		area=base*altura;
		System.out.println("El resultado es: " + area);
	}
}

