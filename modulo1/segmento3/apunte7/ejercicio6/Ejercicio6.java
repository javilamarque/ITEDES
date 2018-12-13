import java.util.Scanner;

public class Ejercicio6{
    
    public static Integer pow(Integer base, Integer exponente){
        Integer result = base;

        for(Integer i = 1; i < exponente; i++)
            result *= base;
        
        
        return result;
    }
    public static Integer sumar(Integer num1, Integer num2){
        Integer resultado = 0;
        resultado = num1 + num2;

        return resultado;
        
        }
    public static Integer restar(Integer num1, Integer num2){
        Integer resultado = 0;
        resultado = num1 - num2;

        return resultado;
    }

    public static Integer multiplicacion(Integer num1, Integer num2){
        Integer resultado = 0;
        resultado = num1 * num2;

        return resultado;
    }

    public static Integer dividir(Integer num1, Integer num2){
        Integer resultado = 0;
        resultado = num1 / num2;

        return resultado;
    }


public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    String seguir = "s";
    boolean op = true;
    int num1, num2, base, exponente, opcion;
    Integer resultado;

    while(op) {
    	System.out.println("1- Sumar");
    	System.out.println("2- Restar");
    	System.out.println("3- Multiplicacion");
 	    System.out.println("4- Dividir");
        System.out.println("5- Potenciar");
        System.out.println("6- salir");
 	    System.out.println("");   	
 	
 	    System.out.print("Ingrese la opcion deseada: ");
         opcion = teclado.nextInt();
         System.out.println(" ");
    
    if(opcion==6){
        System.out.println("Finalizo..............");
        break;
    }else{
 	
 	switch(opcion){
 	    case 1:
 		    System.out.print("Ingrese un numero para la suma: ");
             num1 = teclado.nextInt();
             
            System.out.println(" ");

 		    System.out.print("Ingrese otro numero para la suma: ");
            num2 = teclado.nextInt();

            System.out.println(" ");
 		    resultado = sumar(num1, num2);
            System.out.println("El resultado de la suma es: "+ resultado);
            System.out.println(" ");
        break;

        case 2:
            System.out.println("Ingrese un numero para la resta: ");
            num1 = teclado.nextInt();
            System.out.println(" ");

            System.out.println("Ingrese otro numero para la resta: ");
            num2 = teclado.nextInt();
            System.out.println(" ");
            
            resultado = restar(num1, num2);
            System.out.println("El resultado de la resta es: "+ resultado);
            System.out.println(" ");
        break;

        case 3:
            System.out.println("Ingrese un numero para la multiplicacion: ");
            num1 = teclado.nextInt();
            System.out.println(" ");

            System.out.println("Ingrese otro numero para la multiplicacion: ");
            num2 = teclado.nextInt();
            System.out.println(" ");

            resultado = multiplicacion(num1, num2);
            System.out.println("El resultado de la multiplicacion es: "+ resultado);
            System.out.println(" ");
        break;

        case 4:
            System.out.println("Ingrese un numero para la division: ");
            num1 = teclado.nextInt();
            System.out.println(" ");

            System.out.println("Ingrese otro numero para la division: ");
            num2 = teclado.nextInt();
            System.out.println(" ");

            resultado = dividir(num1, num2);
            System.out.println("El resultado de la division es: "+ resultado);
            System.out.println(" ");
        break;

        case 5:
            System.out.println("Ingrese la base de la potencia");
            base = teclado.nextInt();
            System.out.println(" ");

            System.out.println("Ingrese el exponente de la potencia: ");
            exponente = teclado.nextInt();
            System.out.println(" ");

            resultado = pow(base, exponente);
            System.out.println("El resultado de la potencia es: "+ resultado);
            System.out.println(" ");
        break;

        


     }
    }
}

}
}
