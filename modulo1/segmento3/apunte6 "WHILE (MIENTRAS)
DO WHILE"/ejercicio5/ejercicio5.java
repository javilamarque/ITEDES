import java.util.Scanner;

public class ejercicio5{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		Double num=1.0;
		Double maximo=0.0;
		
		while(num!=0){

			System.out.println("Ingrese un numero para saber cual es el mayor, ingrese 0 para detener: ");
			num = Double.parseDouble(teclado.nextLine());

			if(num>=maximo){
				maximo=num;
			}
		}

			System.out.println("El numero mas grande ingresado es: " + maximo);
	}
}

		
			
