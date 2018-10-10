using System;

namespace Edad.net
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Ingrese su Edad: ");
			
			int edad = Int32.Parse(Console.ReadLine());

			if(edad >= 18)
			{
				Console.WriteLine("Usted es mayor");
			}
			else
			{
				Console.WriteLine("Uste es menor de edad ");
			}
        }
    }
}
