using System;

namespace ejercicio5.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese dos numeros para realizar la resta: ");

			Console.WriteLine("Ingrese el primero numero para la resta: ");
				int num1 = Convert.ToInt32(Console.ReadLine());

			Console.WriteLine("Introduzca el segundo numero para la resta: ");
				int num2 = Convert.ToInt32(Console.ReadLine());

			int resta = num1 - num2;

			Console.WriteLine("El resultado de la resta es: " + resta);
        }
    }
}
