using System;

namespace dotnet
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingrese su edad: ");
				int edad = Int32.Parse(Console.ReadLine());

			Console.WriteLine("Ingrese su genero: ");
				string genero = Console.ReadLine();

				if(edad >= 18)
				{
					Console.WriteLine("Su genero es: " + genero + " Y Usted es mayor de edad ");
				}
				else
				{
					Console.WriteLine("Su genero es: " + genero + " Y Usted es menor de edad ");
				}
        }
    }
}
