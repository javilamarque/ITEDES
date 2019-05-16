import java.util.Scanner;

public class ejercicio4{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		Double num=1.0;
		Double total=0.0;

		while(num!=0){
			System.out.print("Ingrese un numero, si ingresa 0 finaliza: ");
			num = Double.parseDouble(keyboard.nextLine());

			total+=num;

			System.out.println("El total es: " + total);
		}
	}
}

