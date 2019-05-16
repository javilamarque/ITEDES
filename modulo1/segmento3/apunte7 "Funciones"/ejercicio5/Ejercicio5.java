import java.util.Scanner;
public class Ejercicio5 {

    public static Integer cubo(Integer num1) {
        return num1=num1*num1*num1;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese un numero para elevarlo al cubo: ");
        Integer num1 = Integer.parseInt(keyboard.nextLine());

        System.out.println(cubo(num1));
    }
        
}
