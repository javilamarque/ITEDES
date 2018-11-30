import java.util.Scanner;

public class ejercicio3{

	public static String mayor(Integer num1, Integer num2, Integer num3){

		String resultado ="";

		if(num1 == num2 && num1 == num3){
			System.out.println("Los tres numero son iguales: ");
		
		}else if(num1>num2 && num1>num3){
			System.out.println("El numero mayor es: "+num1);
		
		}else if(num2>num1 && num2>num3){
			System.out.println("El numero mayor es: "+num2);
		
		}else{
			System.out.println("El numero mayor es: "+num3);
		}
		return resultado;
	}

	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		String resultado="";
		
		System.out.println("Ingrese el primer numero: ");
		Integer num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Ingrese el segundo numero: ");
		Integer num2 = Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese el tercer numero: ");
		Integer num3 = Integer.parseInt(teclado.nextLine());

		resultado=mayor(num1, num2, num3);
		System.out.println(resultado);



	}
}


			
