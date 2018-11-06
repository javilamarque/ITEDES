import java.util.Scanner;

public class ejercicio1 {
	public static void main(String args[]){
			Scanner teclado = new Scanner(System.in);

			System.out.print("Ingrese un dia (1-Lunes,2-Martes,3-Miercoles, 4-Jueves, 5-Viernes, 6-Sabado, 7-Viernes): ");
			Integer dia = Integer.parseInt(teclado.nextLine());
			String respuesta;

			switch(dia){
				case 1:
					respuesta ="Lunes";
					break;
																	
				case 2:
					respuesta="Martes";
					break;
																															
				case 3:
					respuesta="Miercoles";
					break;

				case 4:
					respuesta="Jueves";
					break;
													
				case 5:
					respuesta="Viernes";
					break;
																												
				case 6:
					respuesta="Sabado";
					break;
																													
				case 7:
					respuesta="Domingo";
					break;
																																						
				default:
					respuesta ="Error";
					break;

			}

			System.out.println("El dia elegido es " + respuesta);

	}
}














