using System;

namespace ejercicio4.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese dos numeros para realizar la suma: ");

				Console.WriteLine("Primer numero para la suma: ");
					int num1 = Convert.ToInt32(Console.ReadLine());

				Console.WriteLine("Ingrese el segundo numero para la suma: ");
				int num2 = Convert.ToInt32(Console.ReadLine());

				int suma = num1 + num2;

				Console.WriteLine("El resultado de la suma es: " + suma);
        }
    }
}
