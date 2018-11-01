using System;

namespace ejercicio7.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingres un numero para la divicion: ");

			Console.Write("Ingrese el primer numero: ");
				int num1 = Convert.ToInt32(Console.ReadLine());

			Console.Write("Ingrese el segundo numero para la divicion: ");
				int num2 = Convert.ToInt32(Console.ReadLine());

			int result = num1 / num2;

			Console.WriteLine("El resultado de la divicion es: " + result);
        }
    }
}
