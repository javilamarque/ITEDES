using System;

namespace ejercicio6.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese un numero para realizar una multiplicacion: ");

			Console.Write("Primer numero para la multiplicacion: ");
				int num1 = Convert.ToInt32(Console.ReadLine());

			Console.Write("Segundo numero para la multiplicacion: ");
				int num2 = Convert.ToInt32(Console.ReadLine());

			int result = num1 * num2;

			Console.WriteLine("El resultado de la multiplicacion es: " + result);
        }
    }
}
