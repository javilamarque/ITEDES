import java.util.Scanner;
public class ejercicio2
{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese su nombre de usuario: ");
		String usuario = teclado.nextLine();

		System.out.print("Ingrese su contraseña: ");
		String pass = teclado.nextLine();

		if ((usuario.equals("Juan") && (pass.equals("1234"))) || (usuario.equals("Pedro") && (pass.equals("5678")))){
			System.out.println("Bienvenido " + usuario);
		}else{
			System.out.println("Usted no es un usuario registrado");
			}
	}
}
