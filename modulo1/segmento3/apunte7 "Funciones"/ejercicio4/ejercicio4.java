import java.util.Scanner;

public class ejercicio4 {
	public static boolean tf(Integer num1) {
		return num1 % 2 == 0;
	}
		
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		Integer num1 = Integer.parseInt(teclado.nextLine());

		System.out.println(tf(num1));
	}
}

