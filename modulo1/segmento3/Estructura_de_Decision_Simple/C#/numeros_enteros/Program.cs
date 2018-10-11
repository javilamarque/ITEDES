using System;

namespace Ingresar10
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese el numero 10: ");

			int number = Int32.Parse(Console.ReadLine());

				if (number == 10)
				{
					Console.WriteLine("Usted ingreso el numero 10 ");
				}
				else
				{
					Console.WriteLine("Usted no ingreso el numero 10 ");
				}
        }
    }
}

