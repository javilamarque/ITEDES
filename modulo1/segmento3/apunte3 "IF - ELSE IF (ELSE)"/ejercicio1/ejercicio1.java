import java.util.Scanner;

public class ejercicio1{
	public static void main(String args[]){
			Scanner teclado = new Scanner(System.in);

			System.out.println("Ingrese un numero: ");
			Integer numero1 = Integer.parseInt(teclado.nextLine());

			System.out.println("Ingrese un numero: ");
			Integer numero2 = Integer.parseInt(teclado.nextLine());
													
			System.out.println("Ingrese un numero: ");
			Integer numero3 = Integer.parseInt(teclado.nextLine());
													
			if(numero1 >= numero2 && numero2 >= numero3){
					System.out.println(numero1.toString() + "-" + numero2.toString() + "-" + numero3.toString());
																										
			}else if(numero2>=numero3 && numero3 >= numero1){
					System.out.println(numero2.toString() + "-" + numero3.toString() + "-" + numero1.toString());
																		
			}else if(numero3>=numero1 && numero1 >= numero2){
					System.out.println(numero3.toString() + "-" + numero1.toString() + "-" + numero2.toString());
																																								

			}else if(numero1>=numero3 && numero3 >= numero2){
			
					System.out.println(numero1.toString() + "-" + numero3.toString() + "-" + numero2.toString());
			

			
			}else if(numero2>=numero1 && numero1 >= numero3){
			
					System.out.println(numero2.toString() + "-" + numero1.toString() + "-" + numero3.toString());
			

			
			}else{
			
					System.out.println(numero3.toString() + "-" + numero2.toString() + "-" + numero1.toString());
			}			
		}
}

