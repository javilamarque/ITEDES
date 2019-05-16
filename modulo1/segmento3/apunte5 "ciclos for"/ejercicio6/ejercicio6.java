import java.util.Scanner;

public class ejercicio6{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);

			System.out.print("Ingrese el numero maximo de X: ");
			Integer maximo = Integer.parseInt(keyboard.nextLine());

			String line = "";
			
			for(Integer i=0; i<maximo; i++){
				line +="x";
				System.out.println(line);
			}

			for(Integer i=maximo-1; i>0;i--){
				line="";
				for(Integer j=0; j<i;j++){
					line += "x";
				}

				System.out.println(line);
			}
		}
	}

