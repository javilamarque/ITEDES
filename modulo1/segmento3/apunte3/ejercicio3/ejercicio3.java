import java.util.Scanner;

public class ejercicio3{
	public static void main(String args[]){
			Scanner teclado = new Scanner(System.in);
				
			String opcion;

			System.out.println("Ingrese un caracter cualquiera : ");
				String caracter = teclado.nextLine();

			if(caracter.toUpperCase().equals("A") || caracter.toUpperCase().equals("E") || caracter.toUpperCase().equals("I") || caracter.toUpperCase().equals("O") || caracter.toUpperCase().equals("U")){
				opcion = "vocal";
			}else if(isNumeric(caracter)){
				opcion="es numero";
			}
			else{
				opcion="consonante";
			}
			System.out.println(caracter.toString() + " es " + opcion );
			}	
	private static boolean isNumeric(String cadena){
	        try {
				Integer.parseInt(cadena);
			return true;
			} catch (NumberFormatException nfe){
			return false;
			}
		}
}

