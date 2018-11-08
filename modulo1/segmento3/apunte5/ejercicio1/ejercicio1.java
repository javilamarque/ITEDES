import java.util.Scanner;

public class ejercicio1{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			System.out.print("Ingrese un numero para realizar la tabla de multiplicar que desea: ");
			Integer num = Integer.parseInt(keyboard.nextLine());

			

			for(Integer i=0; i<=10; i++){
				Integer result= num * i;

					System.out.println(num + " x " + i + " = " + result );
			}
	}
}

