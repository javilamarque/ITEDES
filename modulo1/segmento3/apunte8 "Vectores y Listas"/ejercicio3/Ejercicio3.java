import java.util.Scanner;
import  java.util.ArrayList;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer>lista1 = new ArrayList<Integer>();

        for(int i=0; i<5;i++)
        {
            System.out.println("Ingrese 5 numeros para multiplicar por 2: ");
            Integer numero = Integer.parseInt(teclado.nextLine());
            lista1.add(numero);
        }
        System.out.println(lista1);

        ArrayList<Integer>lista2 = new ArrayList<Integer>();
        for(int i=0; i<5;i++)
        {
            lista2.add(lista1.get(i)*2);
        }
        System.out.println("Los numeros ingresados multiplicado por 2, dan como resultado: " + lista2);
    }
}