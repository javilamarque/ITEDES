import java.util.Scanner;
public class ejercicio4{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

			System.out.print("Ingrese la base deseada: ");
			Integer base = Integer.parseInt(teclado.nextLine());

			System.out.print("Ingrese la altura deseada: ");
			Integer altura = Integer.parseInt(teclado.nextLine());

			String linea="";

			for(Integer i=0; i<=altura;i++){
				linea="";
				for(Integer j=0;j<=base;j++){
					linea+= "x";
				}

					System.out.println(linea);

			}
	}
}

