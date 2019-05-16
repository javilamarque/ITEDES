import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Ahorcado {
    
    // generamos la base de datos
    public static ArrayList<String> generarBaseDatos() {
        Scanner teclado = new Scanner(System.in);
        String seguir = "si";
        String palabras;
        
        ArrayList<String> listaPalabra = new ArrayList<String>();


        while (seguir.equals("si")) {
            System.out.println("Ingrese palabras para cargar a las listas: ");
            palabras = teclado.nextLine();
            listaPalabra.add(palabras);

            System.out.println("Desea agregar otra palabra? (si/no): ");
            seguir = teclado.nextLine();

        }
            return listaPalabra;
    }

        // Buscamos las palabras almacenadas en las listas
    public static String sortear(ArrayList<String>listaJuego) {
        Random palabraAleatoria = new Random();
        int j = palabraAleatoria.nextInt(listaJuego.size());
        return listaJuego.get(j);
    }

    public static ArrayList<Character> convertStringToArrayList(String str) {
        ArrayList<Character> charList = new ArrayList<Character>();
        
        for(int i=0; i<str.length(); i++) {
            charList.add(str.charAt(i));
        }
        
        return charList;
    }

    public void intercambiarLetra(char charIntroducido){
        int pos = 0;
        
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Aca generamos las listas de palabras
        ArrayList<String>listaJuego= new ArrayList<String>();
        listaJuego=generarBaseDatos();

        //Busca las palabras de la lista
        String palabra;
        palabra=sortear(listaJuego);
        

        //Convierte las palabras en listas
        ArrayList<Character>palabraLista = new ArrayList<Character>();
        palabraLista=convertStringToArrayList(palabra);

        //Comienzan las variables
        Integer vidas = 6;
        Integer faltan = palabraLista.size();
        String letra = "";
        
        ArrayList<String> palabraMostrar = new ArrayList<String>();

        //Listas vacias
        for(int i=0; i<palabraLista.size();i++){
            palabraMostrar.add("-");
        }
        

        while(vidas>0 || faltan>0){
            System.out.println(palabraMostrar);
            System.out.println("Ingrese una letra: ");
            letra = teclado.nextLine();
            
            
            if (palabraLista.contains(letra)) {                
                faltan = faltan - Collections.frequency(palabraLista, letra);
                System.out.print("Letras restante " + faltan);
            }
        }     
    }
}