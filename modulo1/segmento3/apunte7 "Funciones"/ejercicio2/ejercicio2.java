import java.util.Scanner;

public class ejercicio2{
	
	public static String multiplo(Integer num1, Integer num2){
			
			String resultado="";

			if (num1%num2==0){
				resultado = num1 + " Es multiplo de " + num2;
			
			}else if(num2 % num1 ==0){
				resultado = num2 + " Es multiplo de " + num1;

			}else{
				resultado = "No son multiplos";
			}
	
		return resultado;
	}
	
	public static void main(String args[]){
		
		Scanner teclado = new Scanner(System.in);
		String resultado="";

		System.out.println("Ingrese un numero: ");
		Integer num1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Ingrese otro numero");
		Integer num2 = Integer.parseInt(teclado.nextLine());

		resultado=multiplo(num1,num2);
		
		System.out.println(resultado);
		}
}

				

