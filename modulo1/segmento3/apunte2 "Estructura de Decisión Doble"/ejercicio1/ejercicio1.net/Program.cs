using System;

namespace ejercicio1.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para saber si es multiplo de 2: ");
				int numero = int.Parse(Console.ReadLine());

				int result = numero%2;

				if(result == 0)

				{
					Console.WriteLine(numero + " Es multiplo de 2");
				}else
				{
				Console.WriteLine("No es multiplo de 2 ");
				}
        }
    }
}
