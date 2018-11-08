import java.util.Scanner;

public class ejercicio5{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		Integer num = Integer.parseInt(keyboard.nextLine());

		String linea="";
			
			for(Integer i=1; i<=num; i++){
				linea +="";
				for(Integer i<=num; i<=5; i++){
				linea += "x";
			}
			}

				System.out.println(linea);
	}
}

