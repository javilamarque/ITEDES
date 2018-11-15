import java.util.Scanner;

public class ejercicio1{

	public static Integer dividir(Integer numero){
			Integer dividir=0;
			for(Integer i=1; i<=numero; i++){
				if(numero%i==0){
					dividir+= 1;
				}
	        }

			return dividir;
	}

	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		Integer num = Integer.parseInt(teclado.nextLine());

		Integer resultado;

		resultado = dividir(num);

		System.out.println("Cantidad de divisores " + resultado);
		}
}
	

		
			
