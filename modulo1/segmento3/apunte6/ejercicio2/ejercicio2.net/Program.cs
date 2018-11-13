using System;

namespace ejercicio2.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Para realizar la suma debe ingresar dos numeros");
			

			Console.Write("Ingrese el primer numero para la suma: ");
			int num1 = int.Parse(Console.ReadLine());

			Console.Write("Ingrese el segundo numero: ");
			int num2 = int.Parse(Console.ReadLine());

			int resultado = num1 + num2;
			Console.WriteLine("El resultado es: " + resultado);
			
			Console.Write("Desea realizar otra operacion? (s/n) ");
			String salir = Console.ReadLine();

			while (salir != "n") {
			Console.WriteLine("Desea realizar otra operacion? (s/n) ");
			
			
			Console.Write("Ingrese el primer numero para la suma: ");
				num1 = int.Parse(Console.ReadLine());

			Console.Write("Ingrese el segundo numero: ");
				num2 = int.Parse(Console.ReadLine());

				resultado = num1 + num2;
			Console.WriteLine("El resultado es: " + resultado);
			
			Console.Write("Desea realizar otra operacion? (s/n) ");
			
			salir = Console.ReadLine();
			}
        }
    }
}
