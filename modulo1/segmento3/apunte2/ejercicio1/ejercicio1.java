import java.util.Scanner;
public class ejercicio1 
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		Integer numero = Integer.parseInt(teclado.nextLine());

		Integer resto = numero%2;

		if(resto !=0){
			System.out.println(numero.toString() + " no es multiplo de 2");
		}else{
			System.out.println(numero.toString() + " es multiplo de 2");

		}
	}
}

