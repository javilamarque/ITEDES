import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;


public class ahorcadoWeb {

    //Declaramos variables
    static String dia, mes, anio;

    public static void main(String[] args) throws InterruptedException, IOException {
        int opcion, azar, fallos = 6;
        String palabras[] = {"POLLO", "ROBOT", "FUTBOL", "AGUA", "LAMPARA"}, palabra;
        //Calculamos la fecha actual
        obtenerFechaActual();

        limpiarPantalla();
        //Iniciamos el mensaje de bienvenida
        System.out.println("Fecha dia" + "/" + mes + "/" + anio);
        System.out.println("_____________________________________");     
        System.out.println("Bienvenid@ al juego del ahorcado!!\n"+ "Esperamos que disfrute maximo lo posible.");
                
        System.out.println("_____________________________________");    
        System.out.println("");
        System.out.println("Por favor, introduzca un metodo de juego\n"
                + "- Pulse uno (1) para jugar contra la maquina (player vs cpu).\n"
                + "- Pulse dos (2) para jugar contra otro usuario (player vs player).\n"
                + "- Pulse tres (3) para salir.");
        System.out.println("");
        opcion = pedirMenu("Que desea hacer?:");

        if (opcion == 1) {
            azar = palabraAzar(palabras);
            palabra = palabras[azar];
            bienvenida();
            do {
                //fallosAhorcado(fallos);
                fallos = empezar(palabra, fallos);
            } while (fallos >= 1);

        }
    }

    static void obtenerFechaActual() {
        //Declaramos el calendario, para obtener fecha actual
        Calendar calendario = Calendar.getInstance();
        dia = Integer.toString(calendario.get(Calendar.DATE));
        mes = Integer.toString(calendario.get(Calendar.MONTH) + 1);
        anio = Integer.toString(calendario.get(Calendar.YEAR));
    }

    static int pedirMenu(String mensaje) {
        int valor = 0;
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);

        do {
            System.out.print(mensaje);
            try {
                valor = Integer.parseInt(teclado.readLine());
            } catch (IOException ex) {
                System.out.println("\tPedirNumeroIntor en la lectura");
            } catch (NumberFormatException e) {
                System.out.println("\tPedirNumeroIntor en el formato del numero");
            }
        } while (valor > 3);

        return valor;
    }

    static void limpiarPantalla() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

    static void bienvenida() throws InterruptedException {
        System.out.println("Haido jugar contra la maquina");
        System.out.println("");
        Thread.sleep(2000);
        System.out.println("----------------------------------------------\n "            + "       BIENVENIDO AL JUEGO DEL AHORCADO\n"
                + "----------------------------------------------");
    }

    static void fallosAhorcado(int fallos) {
        if (fallos == 6) {
            System.out.println("| -----!-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("");
        }
        if (fallos == 5) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("");
        }
        if (fallos == 4) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|      |");
            System.out.println("|");
            System.out.println("|_________");
            System.out.println("");
        }
        if (fallos == 3) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|     /|");
            System.out.println("|");
            System.out.println("|_________");           
            System.out.println("");
        }

        if (fallos == 2) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|     /|\\");
            System.out.println("|");
            System.out.println("|_________");
            System.out.println("");
        }

        if (fallos == 1) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|     /|\\");
            System.out.println("|     /");
            System.out.println("|_________");
            System.out.println("");
        }
        if (fallos < 1) {
            System.out.println("| -----!-");
            System.out.println("|      o");
            System.out.println("|     /|\\");
            System.out.println("|     / \\");
            System.out.println("|_________ ");
            System.out.println("");
            System.out.println("Hasido! :(");
            System.out.println("");
            System.out.println(">>>..._...|..____________________, ,\n"
                    + ">>>....../ `---___________----_____|] = = = = = D BANG BANG!\n"
                    + ">>>...../_==o;;;;;;;;_______.:/\n"
                    + ">>>.....), ---.(_(__) /\n"
                    + ">>>....// (..) ), ----" + ");\n"
                    + ">>>...//___//\n"
                    + ">>>..//___//\n"
                    + ">>>.//___// ");
            System.exit(0);
        }
    }

    static int empezar(String palabra, int fallos) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int numRealizado = 0, cont = 0;
        String palabraOculta[] = new String[palabra.length()], letra = "",
                letraIntroducida = "";

        char a, b;

        System.out.print("Palabra: ");
        for (int i = 0; i < palabra.length(); i++) {
            palabraOculta[i] = "-";
        }

        do {
            mostrarVector(palabraOculta);
            System.out.println("");
            System.out.println("");
            System.out.println("Te quedan " + fallos + " fallos.");

            System.out.println("Has introducido las siguientes letras: " + letraIntroducida);
            if (numRealizado == 1) {
                System.out.println("Has introducido 1 letra fallida");
            } else {
                System.out.println("Has introducido " + numRealizado + " letras fallidas: ");
            }


            System.out.println(palabra);
            letra = insertarLetra("Inserte una letra: ");
            letraIntroducida = letraIntroducida + letra.charAt(0) + " - ";

            for (int i = 0; i < palabra.length(); i++) {
                for (int j = 0; j < palabraOculta.length; j++) {
                    a = palabra.charAt(i);
                    b = letra.charAt(0);
                    if (a == b) {
                        palabraOculta[i] = letra;
                        cont++;
                    }
                }
            }
            if (cont == 0) {
                fallos--;
                numRealizado++;
            }


            System.out.println("");
             fallo = comprobarLetraFallos(palabra, palabraOculta);
             if (fallo = true) {
             fallos--;
             }
            fallosAhorcado(fallos);

        } while (fallos <= 0);

        return fallos;
    }

    static int palabraAzar(String palabras[]) {
        int num;

        num = (int) (Math.random() * palabras.length);
        return num;
    }

    static void mostrarVector(String vec[]) {

        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]);
        }
    }

    static String insertarLetra(String mensaje) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String letra;

        System.out.print(mensaje);
        letra = teclado.readLine();
        return letra;
    }
}	
		
