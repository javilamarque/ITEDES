import java.util.Scanner;
public class ejercicio4{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			System.out.print("Ingrese un numero: ");
			Integer num1 = keyboard.nextInt();

			System.out.print("Ingrese otro numero: ");
			Integer num2 = keyboard.nextInt();

			System.out.print("Ingrese otro numero: ");
			Integer num3 = keyboard.nextInt();

			System.out.print("Ingrese otro numero: ");
			Integer num4 = keyboard.nextInt();

			if(num1 == num2 && num3 == num4){
				System.out.println("todos son iguales");
	
			}else if(num1 == num2){
				System.out.println("El primero y el segundo son iguales");
			
			}else if(num2  == num3){
				System.out.println("El segundo y el tercero son iguales");
			}else if(num3 == num4){
				System.out.println("El tercero y el cuarto son iguales");
			}else if(num1 == num3){
				System.out.println("El primero y el tercero son iguales");
			}else if(num1 == num4){
				System.out.println("El primero y el cuarto son iguales");
			}else if(num2 == num4){
				System.out.println("El segundo y el cuarto son iguales");
			}else{
				System.out.println("Ninguno de los numeros son iguales");
			}
		}
	}

				







