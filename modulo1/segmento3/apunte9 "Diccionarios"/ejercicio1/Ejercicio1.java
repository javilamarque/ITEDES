import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio1{

    public static String cargarPersonas(){
        Scanner teclado = new Scanner(System.in);
        HashMap<String, Object> persona = new HashMap<String, Object>();
            
           

            System.out.print("Nombre: ");
            persona.put ("nombre", teclado.nextLine());

            System.out.print("Apellido: ");
            persona.put("apellido", teclado.nextLine());

            System.out.print("Dni: ");
            persona.put("dni", Integer.parseInt(teclado.nextLine()));

            System.out.print("Direccion: ");
            persona.put("direccion", teclado.nextLine());

            System.out.print("Telefono: ");
            persona.put("telefono", Integer.parseInt(teclado.nextLine()));

            System.out.print("E-mail: ");
            persona.put("email", teclado.nextLine());

            System.out.print("Fecha de nacimiento: ");
            persona.put("fecha de nacimiento", teclado.nextLine());
            System.out.println();
            return (persona.toString());
    }    

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String opcionMenu = "";
        String personas [];
        while (opcionMenu.equals(0)){
           System.out.println("1) Cargar Persona");
           System.out.println("0) Para finalizar");
           System.out.println("Ingrese la opcion deseada");
           opcionMenu = teclado.nextLine();
            
            
            if(opcionMenu.equals("1")){
                String seguir = "si";
                while(seguir.equals("si")){
                    
                    cargarPersonas();
                    System.out.println();
                    System.out.print("Desea agregar otra persona? (si/no): ");
                    seguir = teclado.nextLine();
                
                }
            }  
        }
    }
    
}